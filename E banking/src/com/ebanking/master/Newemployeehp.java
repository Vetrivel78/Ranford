package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newemployeehp {
	
	@FindBy(id="txtUname")
	WebElement En;
	
	@FindBy(id="txtLpwd")
	WebElement Lgpd;
	
	@FindBy(id="lst_Roles")
	WebElement Erole;
	
	@FindBy(id="lst_Branch")
	WebElement Ebranch;
	
	@FindBy(id="BtnSubmit")
	WebElement Esubmit;
	
	public void Newemployeecreation(String Ename,String Pwd, String Rol, String Bra) throws Exception {
		
		En.sendKeys(Ename);
		Lgpd.sendKeys(Pwd);
		Erole.click();
		Erole.sendKeys(Rol);
		Ebranch.click();
		Ebranch.sendKeys(Bra);
		Thread.sleep(4000);
		Esubmit.click();
		
			
	}
	
}
	
	