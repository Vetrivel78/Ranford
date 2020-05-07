package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelemp {

	public static void main(String[] args) throws IOException, InterruptedException {
		// 
		
		Library LB=new Library();
		LB.OpenApp("http://183.82.100.55/ranford2");
		LB.AdminLogin("Admin","M1ndq");
		
		FileInputStream Fis=new FileInputStream("C:\\Users\\mkdvv\\Desktop\\Project Workspace\\E banking\\src\\com\\ebanking\\testdata\\Employeecreation.xlsx");
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		XSSFSheet WS=WB.getSheet("Edata");
		
		int Rcount=WS.getLastRowNum();
		System.out.println(Rcount);
		
		for (int i=1;i<=Rcount;i++)
		
		{
			
			XSSFRow WR=WS.getRow(i);
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			XSSFCell WC2=WR.getCell(2);
			XSSFCell WC3=WR.getCell(3);
			XSSFCell WC4=WR.createCell(4);
			
			String En=WC.getStringCellValue();
			String Lpd=WC1.getStringCellValue();
			String Ro=WC2.getStringCellValue();
			String Br=WC3.getStringCellValue();
			
			String Res=LB.Employeecreation(En, Lpd, Ro, Br);
			System.out.println(Res);
			
			WC4.setCellValue(Res);
		}
		
		FileOutputStream Fos=new FileOutputStream("C:\\Users\\mkdvv\\Desktop\\Project Workspace\\E banking\\src\\com\\ebanking\\results\\Results_Employeecreation.xlsx");
		WB.write(Fos);
		WB.close();
		
					
		}
			
	}


