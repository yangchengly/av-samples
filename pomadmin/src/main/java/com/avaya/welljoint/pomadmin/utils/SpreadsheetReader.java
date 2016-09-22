package com.avaya.welljoint.pomadmin.utils;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Service;

import com.avaya.pim.services.pomagentapiservice.ContactDataType;

@Service
public class SpreadsheetReader {

	public List<ContactDataType> readXlsFile(InputStream inputStream, String contactListName) {
		List<ContactDataType> list = new ArrayList<ContactDataType>();

		Workbook workbook;
		try {
			workbook = WorkbookFactory.create(inputStream);
			int numberOfSheets = workbook.getNumberOfSheets();

			for (int i = 0; i < numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);

				int lastRowNum = sheet.getLastRowNum();
				System.out.println("lastRowNum:" + lastRowNum);
				for (int j = 1; j <= lastRowNum; j++) {
					Row row = sheet.getRow(j);

					/*
					 * String id = getCellFormatValue(row.getCell(0)); String
					 * lastName = getCellFormatValue(row.getCell(1)); String
					 * phoneNumber1 = getCellFormatValue(row.getCell(2)); String
					 * gender = getCellFormatValue(row.getCell(3)); String
					 * balance1 = getCellFormatValue(row.getCell(4)); String
					 * balance2 = getCellFormatValue(row.getCell(5)); String
					 * refundDate = getCellFormatValue(row.getCell(6)); String
					 * cardNum = getCellFormatValue(row.getCell(7)); String
					 * month = getCellFormatValue(row.getCell(8));
					 */

					ContactDataType contactToBeSaved = new ContactDataType();

					contactToBeSaved.setUserContactId(this.getCellFormatValue(row.getCell(0)));
					contactToBeSaved.setLastName(this.getCellFormatValue(row.getCell(1)));
					contactToBeSaved.setPhoneNumber1(this.getCellFormatValue(row.getCell(2)));
					contactToBeSaved.setContactListName(contactListName);

					list.add(contactToBeSaved);
				}
			}

		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}

	private String getCellFormatValue(Cell cell) {
		String cellvalue = "";
		
		if (cell != null) {
			
			switch (cell.getCellType()) {
			case HSSFCell.CELL_TYPE_NUMERIC:
			case HSSFCell.CELL_TYPE_FORMULA: {
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					cellvalue = sdf.format(date);
				} else {
					cellvalue = String.valueOf((int) cell.getNumericCellValue());
				}
				break;
			}
			case HSSFCell.CELL_TYPE_STRING:
				cellvalue = cell.getRichStringCellValue().getString();
				break;
			default:
				cellvalue = " ";
			}
		} else {
			cellvalue = "";
		}
		
		return cellvalue.trim();
	}
}
