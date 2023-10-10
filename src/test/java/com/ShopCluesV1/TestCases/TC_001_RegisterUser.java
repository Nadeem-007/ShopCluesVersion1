package com.ShopCluesV1.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShopCluesV1.PageObject.IndexPage;

public class TC_001_RegisterUser extends BaseClass {

	@Test
	public void registerUser() throws IOException, InterruptedException {
	IndexPage page=new IndexPage(driver);
	Thread.sleep(300);
	page.getSigninLink().click();
	Thread.sleep(1000);
	page.getPopUp().click();
	Thread.sleep(1000);
	page.getRegisterTab().click();
	Thread.sleep(1000);
	page.getEmailTxtField().sendKeys(utils.ReadDataFromProperties("email"));
	Thread.sleep(1000);
	page.getPhoneTxtField().sendKeys(utils.ReadDataFromProperties("phone"));
	Thread.sleep(1000);
	page.getCheckbox().click();
	Thread.sleep(1000);
	page.getPassword().sendKeys(utils.ReadDataFromProperties("password"));
	Thread.sleep(1000);
	page.getRegisterLink().click();
	Thread.sleep(3000);

	}
}
