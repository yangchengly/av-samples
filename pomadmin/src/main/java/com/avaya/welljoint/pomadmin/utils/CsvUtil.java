package com.avaya.welljoint.pomadmin.utils;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.jumpmind.symmetric.csv.CsvReader;

public class CsvUtil {
	// ��ȡcsv�ļ�
	public List<String[]> readCsv(String filePath) throws Exception {
		List<String[]> csvList = new ArrayList<String[]>();
		if (isCsv(filePath)) {
			CsvReader reader = new CsvReader(filePath, ',', Charset.forName("GBK"));
			reader.readHeaders(); // ������ͷ �����Ҫ��ͷ�Ļ�����Ҫд��䡣
			while (reader.readRecord()) { // ���ж������ͷ������
				csvList.add(reader.getValues());
			}
			reader.close();
		} else {
			System.out.println("���ļ�����CSV�ļ���");
		}
		return csvList;
	}

	// �ж��Ƿ���csv�ļ�
	private boolean isCsv(String fileName) {
		return fileName.matches("^.+\\.(?i)(csv)$");
	}

	// ��������
	public static void main(String[] args) throws Exception {
		String filepath = "D:/ContactsTemplate.csv";
		
		CsvUtil su = new CsvUtil();
		List<String[]> list = su.readCsv(filepath);
		
		for (int r = 0; r < list.size(); r++) {
			for (int c = 0; c < list.get(r).length; c++) {
				String cell = list.get(r)[c];
				System.out.print(cell + "\t");
			}
			System.out.print("\n");
		}
	}
}
