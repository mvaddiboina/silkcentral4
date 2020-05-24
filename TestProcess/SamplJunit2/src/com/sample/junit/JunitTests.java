package com.sample.junit;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sample.calculation.Calculation;
import com.sample.calculation.ParseExcelReport;

import jxl.read.biff.BiffException;

public class JunitTests {
	
	@Test
	public  void generateReport() throws IOException, InterruptedException
	{
		
		System.out.println(System.getProperty("#sctm_source_root_dir"));
		String userDir = System.getProperty("user.dir");
		System.out.println(userDir);
		String filePath = "D:\\temp\\ProcessBat\\process.bat";
		System.out.println(filePath);
		Runtime.getRuntime().exec(filePath);
		Thread.sleep(1000*60*1);
	}
	@Test  
    public void TC001() throws BiffException, IOException{  
        assertEquals("PASS",ParseExcelReport.testStatus("TC1"));  
       }  
	
	@Test  
    public void TC002() throws BiffException, IOException{  
		assertEquals("PASS",ParseExcelReport.testStatus("TC2"));  
   
    }  
}
