package com.ShopCluesV1.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebdriverImplicityWait {

	public void implicitWait(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
}
