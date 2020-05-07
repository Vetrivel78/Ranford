package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newrolehp {
	@FindBy(id="txtRname")
	WebElement Rname;
	
	@FindBy(id="lstRtypeN")
	WebElement Rtype;
	
	@FindBy(id="btninsert")
	WebElement Rsubmit;
	
	public void rolecreation(String Rn,String Rt) throws InterruptedException
	{
		Rname.sendKeys(Rn);
		Rtype.sendKeys(Rt);
		Thread.sleep(4000);
		Rsubmit.click();
	}
}
