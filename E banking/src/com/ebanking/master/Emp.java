package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Emp extends Base {
	
	@Test(dataProvider= "Emdata")
		public void emp(String En, String Lpd, String Ro, String Br) throws InterruptedException
	{
		Lb.Employeecreation(En, Lpd, Ro, Br);
	}
	@DataProvider
	public Object [][] Emdata()
	
	{
		Object [][] obj=new Object[3][4];
		obj[0][0]="Arun";
		obj[0][1]="12345";
		obj[0][2]="testIT";
		obj[0][3]="Abc123";
		
		obj[1][0]="Peter";
		obj[1][1]="12546";
		obj[1][2]="testIT";
		obj[1][3]="Abc123";
		
		obj[2][0]="Mark";
		obj[2][1]="56789";
		obj[2][2]="testIT";
		obj[2][3]="Abc123";
		
		return obj;
		
		
				
	}

}
