package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscripts {
	

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mkdvv\\Desktop\\geckodriver.exe");
		// TODO Auto-generated method stub
		String expval="Ranford Bank";
// Launch 
	WebDriver driver =new FirefoxDriver();
	driver.get("http://183.82.100.55/ranford2");
	driver.manage().window().maximize();
	String Actval= driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	// Comparison
	if (expval.equalsIgnoreCase(Actval)) {
		System.out.println("Ranford application launch");
		
	}else
	{
		System.out.println("Ranford application not launch");
	}
	
	
	//String  Tit = driver.getTitle();
	//System.out.println(Tit);
	expval="Welcome to Admin";
	
	// Admin Login
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
	driver.findElement(By.xpath(".//*[@id='login']")).click();
	Actval= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	if (expval.equalsIgnoreCase(Actval)) {
		System.out.println("Admin Homepage launch");
		
	}else
	{
		System.out.println("Admin Homepage not launch");
	}
	expval="Sucessfully";
	// Branch Creation
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
    driver.findElement(By.xpath(".//*[@id='BtnNewBR']")).click();
    driver.findElement(By.id("txtbName")).sendKeys("srnagar546");
    driver.findElement(By.id("txtAdd1")).sendKeys("mainroad");
    driver.findElement(By.id("txtZip")).sendKeys("50062");
   
    // dropdown
    Select ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
    ctry.selectByVisibleText("INDIA");
    Select sta=new Select(driver.findElement(By.id("lst_stateI")));
    sta.selectByVisibleText("Andhra Pradesh");
    Select city=new Select(driver.findElement(By.id("lst_cityI")));
    city.selectByVisibleText("Hyderabad");
    driver.findElement(By.id("btn_insert")).click();
    //wait
    Thread.sleep(4000);
    // Alert
   Actval= driver.switchTo().alert().getText();
   driver.switchTo().alert().accept();
   if (Actval.contains(expval)) 
   {
	   System.out.println("Branch Created");
	   }
	   
	   else
	   {
		   System.out.println("Branch already exist");
	
}
  
     expval ="Sucessfully";
   //Home
    driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
    // Roles Creation
    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
    driver.findElement(By.id("btnRoles")).click();
    driver.findElement(By.id("txtRname")).sendKeys("QATestled");
    Select rolety=new Select(driver.findElement(By.id("lstRtypeN")));
    rolety.selectByVisibleText("E");
    driver.findElement(By.id("btninsert")).click();
    Thread.sleep(4000);
    Actval= driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
    if (Actval.contains(expval))
    {
    	System.out.println("Role Created");
    	   }
    else 
    	
    {
    	
    	System.out.println("Role already exist");
  
    }
    
    expval="Successfully";
     
    // home
    driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
    // Employee Creation
    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
    driver.findElement(By.id("BtnNew")).click();
    driver.findElement(By.id("txtUname")).sendKeys("Arun");
    driver.findElement(By.id("txtLpwd")).sendKeys("12345");
    Select role=new Select(driver.findElement(By.id("lst_Roles")));
    role.selectByVisibleText("testIT");
    Select branch=new Select(driver.findElement(By.id("lst_Branch")));
    branch.selectByVisibleText("Abc123");
    driver.findElement(By.id("BtnSubmit")).click();
    Thread.sleep(4000);
    Actval= driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
    if (Actval.contains(expval))
    {
    	System.out.println("employee Created");
    	   }
    else 
    	
    {
    	
    	System.out.println("employee already exist");
  
    }
    
    	
        
    //home
    driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
    // Logout
    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
    driver.close();
    
    
    
    
    
    
    
    
    
	}
	
	
	 }
	
	
	
	
	


	
	
	


