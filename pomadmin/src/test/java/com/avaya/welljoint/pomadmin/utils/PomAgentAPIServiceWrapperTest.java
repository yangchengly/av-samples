package com.avaya.welljoint.pomadmin.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

import com.avaya.pim.services.pomagentapiservice.ContactDataType;

public class PomAgentAPIServiceWrapperTest {	

	@Test
	public void testSaveContactToList() {
		File file = new File("D:/ContactsTemplate.xls");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		SpreadsheetReader reader = new SpreadsheetReader();
		List<ContactDataType> list = reader.readXlsFile(fis, "aaa");
		
		System.out.println(list.size());
	}
}
