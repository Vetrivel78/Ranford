package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Emphp {
	@FindBy(id="BtnNew")
	WebElement Ne;
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement Eh;
	
	public void Newemployee() {
		Ne.click();
	}
		
		public void  Emphome() {
			Eh.click();
			
	}

}
