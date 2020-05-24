package com.sample.junit;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sample.calculation.Calculation;
import com.sample.calculation.ParseExcelReport;

import jxl.read.biff.BiffException;

public class JunitTests {
	
	@BeforeClass
	public static void generateReport() throws IOException, InterruptedException
	{
		String userDir = System.getProperty("user.dir");
		System.out.print(userDir);
		String robotPath = userDir.replace("SamplJunit2", "")+"Main.xaml";
		System.out.print(robotPath);
		String filePath = userDir.replace("SamplJunit2", "")+"ProcessBat\\process.bat "+robotPath;
		System.out.print(filePath);
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
