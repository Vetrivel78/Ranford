package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, Exception {
		
		
		Library LB=new Library();
		
		LB.OpenApp("http://183.82.100.55/ranford2");
		LB.AdminLogin("Admin", "M1ndq");
		
		//To Get Test Data
		
		FileInputStream Fis=new FileInputStream("C:\\Users\\mkdvv\\Desktop\\Project Workspace\\E banking\\src\\com\\ebanking\\testdata\\Rolecreation.xlsx");
		
		// Workbook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		
		// Sheets
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		// Row count
		
		int Rcount=WS.getLastRowNum();
		System.out.println(Rcount);
		
		// Multiple Iterations----Loop
		
		for (int i=1;i<=Rcount;i++)
		
		{
			// Rows
			
			XSSFRow WR=WS.getRow(i);
			
								
			// Cells
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			//Cell Values
			
			String Rname=WC.getStringCellValue();
			String RType=WC1.getStringCellValue();
			
			String Res=LB.Rolecreation(Rname, RType);
			
			
			System.out.println(Res);
			
			WC2.setCellValue(Res);
			
		}
			
			// Results
			
			FileOutputStream Fos=new FileOutputStream("C:\\Users\\mkdvv\\Desktop\\Project Workspace\\E banking\\src\\com\\ebanking\\results\\Results_Rolecreation.xlsx");
			
			WB.write(Fos);
			WB.close();
			
	}
			
		
			
		}


