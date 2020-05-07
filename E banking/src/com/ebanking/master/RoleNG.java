package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNG extends Base {
	
	@Test(dataProvider="Rdata")
	
	public void Role(String Rn,String Rt) throws InterruptedException
	{
		Lb.Rolecreation(Rn,Rt);
		
	
	
}
	@DataProvider
	public Object [][] Rdata()
	{
	Object [][] obj=new Object[3][2];
	obj[0][0]="Teller";
	obj[0][1]="C";
	
	obj[1][0]="Clerk";
	obj[1][1]="C";
	
	obj[2][0]="Cashier";
	obj[2][1]="C";
	
	return obj;
	}
	
	
	

}
