package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Librarytestng {
	WebDriver driver;
	String expval,Actval;
	FileInputStream Fis;
	Properties Pr;
	
	
@Test (priority=1)	
public void OpenApp() throws IOException
{
	Fis=new FileInputStream("C:\\Users\\mkdvv\\Desktop\\Project Workspace\\E banking\\src\\com\\ebanking\\properties\\Repository.properties");
	Pr=new Properties();
	Pr.load(Fis);
	
	
	
	expval="Ranford Bank";
	driver =new FirefoxDriver();
	driver.get("http://183.82.100.55/ranford2/");
	driver.manage().window().maximize();
	Actval= driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	// Comparison
	if (expval.equalsIgnoreCase(Actval)) {
		System.out.println("Ranford application launch");
		
	}
	else
	{
		System.out.println("Ranford application not launch");
	}
	
	

}
@Test(priority=2)
public void AdminLogin()
{
expval="Welcome to Admin";
	
	driver.findElement(By.id(Pr.getProperty("Uname"))).sendKeys("Admin");
	driver.findElement(By.id(Pr.getProperty("Pswd"))).sendKeys("M1ndq");
	driver.findElement(By.id(Pr.getProperty("Lgn"))).click();
	Actval= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	if (expval.equalsIgnoreCase(Actval))
	{
		System.out.println("Admin Homepage launch");
		
	}else
	{
		System.out.println("Admin Homepage not launch");
	}


}

@Test(priority=3)
public void Branchcreation() throws InterruptedException

{
	expval="Sucessfully";
	driver.findElement(By.xpath(Pr.getProperty("Bbutton"))).click();
    driver.findElement(By.xpath(Pr.getProperty("Nbbutton"))).click();
    driver.findElement(By.id(Pr.getProperty("bname"))).sendKeys("srnagar546");
    driver.findElement(By.id(Pr.getProperty("Add1"))).sendKeys("mainroad");
    driver.findElement(By.id(Pr.getProperty("Zip"))).sendKeys("50062");
   
    //dropdown
    Select ctry=new Select(driver.findElement(By.id(Pr.getProperty("Ctry"))));
    ctry.selectByVisibleText("INDIA");
    Select sta=new Select(driver.findElement(By.id(Pr.getProperty("Sta"))));
    sta.selectByVisibleText("Andhra Pradesh");
    Select city=new Select(driver.findElement(By.id(Pr.getProperty("City"))));
    city.selectByVisibleText("Hyderabad");
    driver.findElement(By.id(Pr.getProperty("BSbutton"))).click();
    
    Thread.sleep(4000);
    Actval= driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
    driver.findElement(By.xpath(Pr.getProperty("EHbutton"))).click();
   if 
   (Actval.contains(expval)) 
   {
	   System.out.println("Branch Created");
	  
   }
	   
	   else
	   {
		   System.out.println("Branch already exist");
		   
	}
   
        
}
@Test(priority=4)

public void Rolecreation() throws InterruptedException
{
	expval ="Sucessfully";
	  
	    // Roles Creation
	    driver.findElement(By.xpath(Pr.getProperty("Rbuttton"))).click();
	    driver.findElement(By.id(Pr.getProperty("Nrolebutton"))).click();
	    driver.findElement(By.id(Pr.getProperty("Rname"))).sendKeys("QATestled");
	    Select rolety=new Select(driver.findElement(By.id(Pr.getProperty("Rtype"))));
	    rolety.selectByVisibleText("E");
	    driver.findElement(By.id(Pr.getProperty("RSbutton"))).click();
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
	       
	    
	    	     
	    // home
	    driver.findElement(By.xpath(Pr.getProperty("RHbutton"))).click();

	   
}

@Test(priority=5)
public void Employeecreation() throws InterruptedException

{
	 expval="Successfully";
     
	   	    // Employee Creation
	    driver.findElement(By.xpath(Pr.getProperty("Ebutton"))).click();
	    driver.findElement(By.id(Pr.getProperty("NEmpbutton"))).click();
	    driver.findElement(By.id(Pr.getProperty("Empname"))).sendKeys("Arun");
	    driver.findElement(By.id(Pr.getProperty("Lgpwd"))).sendKeys("12345");
	    Select role=new Select(driver.findElement(By.id(Pr.getProperty("Erole"))));
	    role.selectByVisibleText("testIT");
	    Select branch=new Select(driver.findElement(By.id(Pr.getProperty("Ebranch"))));
	    branch.selectByVisibleText("Abc123");
	    driver.findElement(By.id(Pr.getProperty("ESbutton"))).click();
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
	    driver.findElement(By.xpath(Pr.getProperty("EHbutton"))).click();
 
}
@Test(priority=6)
public void Logout() throws InterruptedException
{
	Thread.sleep(4000);
	
	driver.findElement(By.xpath(Pr.getProperty("Logout"))).click();
}

@Test(priority=7)

public void Close()
{
	 driver.close();
}


}
