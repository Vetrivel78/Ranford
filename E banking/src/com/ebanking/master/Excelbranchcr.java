package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelbranchcr {

	public static void main(String[] args) throws IOException, InterruptedException {
		// 
		Library LB=new Library();
		
		LB.OpenApp("http://183.82.100.55/ranford2");
		LB.AdminLogin("Admin","M1ndq");
		
		FileInputStream Fis=new FileInputStream("C:\\Users\\mkdvv\\Desktop\\Project Workspace\\E banking\\src\\com\\ebanking\\testdata\\Branch Creation.xlsx");
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		XSSFSheet WS=WB.getSheet("Brdata");
		
		int Rcount=WS.getLastRowNum();
		System.out.println(Rcount);
		
		for (int i=1;i<=Rcount;i++) 
			
				
		{
			XSSFRow WR=WS.getRow(i);
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			XSSFCell WC2=WR.getCell(2);
			XSSFCell WC3=WR.getCell(3);
			XSSFCell WC4=WR.getCell(4);
			XSSFCell WC5=WR.getCell(5);
			
			XSSFCell WC6=WR.createCell(6);
			
			String Bn=WC.getStringCellValue();
			String Add=WC1.getStringCellValue();
			String Zip=WC2.getStringCellValue();
			String Crty=WC3.getStringCellValue();
			String Sat=WC4.getStringCellValue();
			String cty=WC5.getStringCellValue();
			
			
			String Res=LB.Branchcreation(Bn, Add, Zip, Crty, Sat, cty);
			System.out.println(Res);
			
			WC6.setCellValue(Res);
			
		}
		
			FileOutputStream Fos=new FileOutputStream("C:\\Users\\mkdvv\\Desktop\\Project Workspace\\E banking\\src\\com\\ebanking\\results\\Results_Branchcreation.xlsx");
			WB.write(Fos);
			WB.close();
		}
	}
	
			
			
						
		
