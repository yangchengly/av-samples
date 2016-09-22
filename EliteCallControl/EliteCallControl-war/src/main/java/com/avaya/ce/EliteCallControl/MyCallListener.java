package com.avaya.ce.EliteCallControl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.avaya.ce.EliteCallControl.db.EntityManagerFactoryWrapper;
import com.avaya.ce.EliteCallControl.db.MobileOwnershipDao;
import com.avaya.ce.EliteCallControl.db.entity.MobileOwnership;
import com.avaya.collaboration.call.Call;
import com.avaya.collaboration.call.CallListenerAbstract;
import com.avaya.collaboration.call.TheCallListener;
import com.avaya.collaboration.util.logger.Logger;

/*
 * This class is needed if an application with call features is written.
 * If you have an application which is doing only HTTP related operations, remove this class from the project.
 * 
 * For HTTP only application, also remove the sip.xml from src/main/java/webapp/WEB-INF and blank out details from
 * CARRule.xml. Look at the files for more details.
 * 
 */
@TheCallListener
public class MyCallListener extends CallListenerAbstract {
	private static Logger logger = Logger.getLogger(MyCallListener.class);

	public MyCallListener() {
	}

	@Override
	public final void callIntercepted(final Call call) {
		logger.finer("Entered callIntercepted.");

		String callingNum = call.getCalledParty().getHandle();		
		logger.finer("callingNum:" + callingNum);

		/*
		 * Remove outgoing code of telephone if it exits.
		 */
		String outgoingCode = ServiceAttributesUtil.getServiceAttribute(Constants.SERV_ATTR_OUTGOING_CODE);
		logger.finer("outgoing code:" + outgoingCode);
		
		if (outgoingCode != null && outgoingCode.length() == 1) {
			callingNum = callingNum.substring(1);
		}

		String CallingNumOfFirst7Digits = null;

		/*
		 * Substr the first 7 digits of mobile number for mobile number; do
		 * nothing for line number;
		 */
		if (callingNum.length() == 11 && callingNum.indexOf('1') == 0) {
			CallingNumOfFirst7Digits = callingNum.substring(0, 7);			
		} else if (callingNum.length() == 12 && callingNum.indexOf("01") == 0) {
			CallingNumOfFirst7Digits = callingNum.substring(1, 8);
			callingNum = callingNum.substring(1);
		} else {
			return;
		}
		
		logger.finer("CallingNumOfFirst7Digits:" + CallingNumOfFirst7Digits);

		/*
		 * Query which city the number is being called in phonearea table in DB
		 */
		String areacode = this.getAreacodeBy7DigitsMobile(CallingNumOfFirst7Digits);
		if (areacode == null || areacode.equals("")) {
			callingNum = "990" + callingNum;;
			logger.finer("callingNum:" + callingNum);
			
			call.divertTo(callingNum);
			return;
		}
		
		logger.finer("areacode queried:" + areacode);

		/*
		 * Get service attribute "branchAreacodes" and identify if the areacode
		 * of moible number belongs to one of areacodes of branches, insert
		 * areacode if it's true.
		 */
		String branchAreacodes = ServiceAttributesUtil.getServiceAttribute(Constants.SERV_ATTR_BRANCH_AREACODES);
		logger.finer("branchAreacodes:" + branchAreacodes);
		
		if (branchAreacodes == null) {
			callingNum = "990" + callingNum;
			logger.finer("callingNum:" + callingNum);
			
			call.divertTo(callingNum);
			return;
		}

		// If the number being called is in the 29 cities, then add 99 and area code in front of mobile number, otherwise add 990 in the front.  
		if (branchAreacodes.indexOf(areacode) >= 0) {
			callingNum = "99" + areacode + callingNum;
			logger.finer("callingNum:" + callingNum);
			
			call.divertTo(callingNum);
		} else {			
			callingNum = "990" + callingNum;
			logger.finer("callingNum:" + callingNum);
			
			call.divertTo(callingNum);
		}
	}

	private String getAreacodeBy7DigitsMobile(String mobile) {		
		
		EntityManagerFactory emf = EntityManagerFactoryWrapper.getInstance().getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		logger.finer("EntityManager Object" + em.toString() + " was retrieved");

		MobileOwnershipDao moDao = new MobileOwnershipDao(em);
		MobileOwnership mo = moDao.find(mobile);
		
		if (mo == null)
			return null;

		return mo.getAreacode();
	}	
}
