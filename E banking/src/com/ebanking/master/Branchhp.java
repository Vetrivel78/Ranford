package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Branchhp {
	@FindBy(xpath=".//*[@id='BtnNewBR']")
	WebElement Nb;
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Bh;
	
	public void Newbranch()
	{
		Nb.click();
	}
	
	public void Branchhome()
	
	{
		Bh.click();
	}
	
	

}
