package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchNG extends Base {

	@Test(dataProvider="Brdata")
	public void Br(String Bn, String Add, String Zip, String Ctry, String Sta, String City) throws InterruptedException
	{
	Lb.Branchcreation(Bn, Add, Zip, Ctry, Sta, City);
	
	}
	
	@DataProvider
	public Object [][] Brdata()
	{
		Object [][] obj=new Object[3][6];
		obj[0][0]="Mainbr";
		obj[0][1]="rknagar";
		obj[0][2]="50051";
		obj[0][3]="INDIA";
		obj[0][4]="Andhra Pradesh";
		obj[0][5]="Hyderabad";
		
		obj[1][0]="kasturi";
		obj[1][1]="choolai";
		obj[1][2]="50051";
		obj[1][3]="INDIA";
		obj[1][4]="Andhra Pradesh";
		obj[1][5]="Hyderabad";
		
		obj[2][0]="Adyarr";
		obj[2][1]="Besant";
		obj[2][2]="50061";
		obj[2][3]="INDIA";
		obj[2][4]="Andhra Pradesh";
		obj[2][5]="Hyderabad";
		
		return obj;
		
			
			
	}
	
}
