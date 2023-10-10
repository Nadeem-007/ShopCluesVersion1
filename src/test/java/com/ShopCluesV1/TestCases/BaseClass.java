package com.ShopCluesV1.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ShopCluesV1.GenericUtility.FileUtility;
import com.ShopCluesV1.GenericUtility.WebdriverImplicityWait;

public class BaseClass {

	public static WebDriver driver;
	
	FileUtility utils=new FileUtility();
	WebdriverImplicityWait implicitwait=new WebdriverImplicityWait();
	
	
	@BeforeClass
	public void setup() throws IOException {
		String browser = utils.ReadDataFromProperties("browser");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(utils.ReadDataFromProperties("url"));
		implicitwait.implicitWait(driver);
		
		
	}
	
	@AfterClass
	public void teardown() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
