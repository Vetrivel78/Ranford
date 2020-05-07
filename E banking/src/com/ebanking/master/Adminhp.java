package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminhp {
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement Br;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement Ro;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	WebElement Emp;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")
    WebElement Logout;
	
	public void Branch()
	
	{
		Br.click();
		
	}
	
	public void Role()
	{
		Ro.click();
			
	}
	
	public void Employee()
	
	{
		Emp.click();
			
		}
	
	public void Logout()
	
	{
		Logout.click();
		
			}
	
	

}
