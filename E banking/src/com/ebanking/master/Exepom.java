package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom {
	WebDriver driver;
@BeforeTest
	public void login()
	{
		driver=new FirefoxDriver();
		driver.get("http://183.82.100.55/ranford2");
		driver.manage().window().maximize();
		
		// Pagefactory
		
		Ranfordhp rhp=PageFactory.initElements(driver, Ranfordhp.class);
		rhp.login();
	}
		
	@Test(dataProvider="Rdata")
	public void Rcreation(String Rn, String Rt) throws InterruptedException
	
     {
		Adminhp ahp=PageFactory.initElements(driver, Adminhp.class);
		ahp.Role();
				
		
		Rolehp rohp=PageFactory.initElements(driver, Rolehp.class);
		rohp.Newrole();
		
		Newrolehp nrhp=PageFactory.initElements(driver, Newrolehp.class);
		nrhp.rolecreation(Rn,Rt);
		
		 driver.switchTo().alert().accept();
		 rohp.Rolehome();
     }
		 @Test(dataProvider="Brdata")
		 public void Bcreation(String Bn, String Add, String Zip, String Ctry, String Sta, String City) throws InterruptedException
		 {
			 Adminhp ahp=PageFactory.initElements(driver, Adminhp.class);	 
		 ahp.Branch();
		 
		 
		 
		 Branchhp brhp=PageFactory.initElements(driver, Branchhp.class);
		 brhp.Newbranch();
		 
		 Newbranchhp nbhp=PageFactory.initElements(driver, Newbranchhp.class);
		 nbhp.Newbranchcreation(Bn,Add,Zip,Ctry,Sta,City);
		 driver.switchTo().alert().accept();
		 brhp.Branchhome();
		 }
		 @Test(dataProvider="Emdata")
		 public void Ecreation(String Ename, String Pwd, String Rol, String Bra) throws Exception
		 {
			 Adminhp ahp=PageFactory.initElements(driver, Adminhp.class);
		 ahp.Employee();
		 
		 Emphp emhp=PageFactory.initElements(driver, Emphp.class);
		 emhp.Newemployee();
		 
		 Newemployeehp nehp=PageFactory.initElements(driver, Newemployeehp.class);
		 nehp.Newemployeecreation(Ename,Pwd,Rol,Bra);
		 driver.switchTo().alert().accept();
		 emhp.Emphome();
		 
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

