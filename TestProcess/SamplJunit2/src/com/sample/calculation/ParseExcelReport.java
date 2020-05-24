package com.sample.calculation;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ParseExcelReport {

	public static String testStatus(String testCaseId) throws BiffException, IOException {
		String status = "";
		String userDir = System.getProperty("user.dir");
		String filePath = userDir.replace("SamplJunit2", "")+"\\Reports\\TestReport.xls";
		System.out.println(filePath);
		FileInputStream fs = new FileInputStream(filePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet s = wb.getSheet("TestReport");
		if (testCaseId.equals("TC1"))
			status = s.getCell(1, 1).getContents().toString().trim();
		if (testCaseId.equals("TC2"))
			status = s.getCell(1, 2).getContents().toString().trim();

		return status;
	}

}
