package com.ShopCluesV1.TestCases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.ShopCluesV1.PageObject.IndexPage;

public class TC_003_DDT extends BaseClass{

	@Test(dataProvider = "datagiver")
	public void dataDriverTestCase(String email, String phone,String pwd ) throws InterruptedException {
		IndexPage page=new IndexPage(driver);
		Thread.sleep(300);
		page.getSigninLink().click();
		Thread.sleep(1000);
		page.getPopUp().click();
		Thread.sleep(1000);
		page.getRegisterTab().click();
		Thread.sleep(1000);
		page.getEmailTxtField().sendKeys(email);
		Thread.sleep(1000);
		page.getPhoneTxtField().sendKeys(phone);
		Thread.sleep(1000);
		page.getCheckbox().click();
		Thread.sleep(1000);
		page.getPassword().sendKeys(pwd);
		Thread.sleep(1000);
		page.getRegisterLink().click();
		Thread.sleep(3000);
		
	}
	
	@DataProvider(name="datagiver")
	public Object[][] datagiver(){
			
		Object [][] obj=new Object[4][3];
		
		obj[0][0]="mdnadeemphaniband@gmail.com";
		obj[0][1]="8088422972";
		obj[0][2]="Nadeem123!";
		
		obj[1][0]="mdnadeemphaniband2@gmail.com";
		obj[1][1]="8088422942";
		obj[1][2]="Nadee123!";
		
		obj[2][0]="mdnadeemphaniband2@gmail.com";
		obj[2][1]="8088432942";
		obj[2][2]="Nadee2223!";
		
		return obj;	
		
	}
}
