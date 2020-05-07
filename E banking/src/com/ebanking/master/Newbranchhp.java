package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newbranchhp {
	@FindBy(id="txtbName")
	WebElement Bn;
	
	@FindBy(id="txtAdd1")
	WebElement Add;
	
	@FindBy(id="txtZip")
	WebElement Zip;
	
	@FindBy(id="lst_counrtyU")
	WebElement Ctry;
	
	@FindBy(id="lst_stateI")
	WebElement Sta;
	
	@FindBy(id="lst_cityI")
	WebElement City;
	
	@FindBy(id="btn_insert")
	WebElement Bsubmit;
	
	public void Newbranchcreation(String Bname, String Add1, String Zp, String Cty, String Stat, String Cy) throws InterruptedException 
	{
		
		Bn.sendKeys(Bname);
		Add.sendKeys(Add1);
		Zip.sendKeys(Zp);
		Ctry.click();
		Ctry.sendKeys(Cty);
		Sta.click();
		Sta.sendKeys(Stat);
		Thread.sleep(4000);
		City.click();
		City.sendKeys(Cy);
		Thread.sleep(4000);
				Bsubmit.click();
		
			
	}
	

}
