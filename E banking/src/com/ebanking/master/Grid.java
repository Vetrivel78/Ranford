package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid {
	
	DesiredCapabilities cap;
	@Parameters("browser")
	@Test
	public void gd(String br) throws MalformedURLException {
		if (br.equalsIgnoreCase("firefox")) {
			cap=new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		else if (br.equalsIgnoreCase("Chrome")) {
			cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.7:4444/wd/hub"),cap);
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2/");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
		driver.findElement(By.xpath(".//*[@id='login']")).click();
		
	}

}
