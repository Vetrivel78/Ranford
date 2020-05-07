package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rolehp {
	@FindBy(id="btnRoles")
	WebElement Nr;
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Rh;
	
	public void Newrole()
	{
		Nr.click();
	}
	
	public void Rolehome()
	{
		Rh.click();
	}
	
}
