package com.ShopCluesV1.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShopCluesV1.PageObject.IndexPage;

public class TC_002_LoginUser extends BaseClass {

	@Test
	public void loginUser() throws IOException, InterruptedException {
		
		IndexPage page=new IndexPage(driver);
		page.getSigninLink().click();
		Thread.sleep(1000);
		page.getPopUp().click();
		Thread.sleep(1000);
		page.getEmailIdForLogin().sendKeys(utils.ReadDataFromProperties("email"));
		Thread.sleep(1000);
		page.getLoginLink().click();
		Thread.sleep(1000);
		page.getMobileTxtField().sendKeys(utils.ReadDataFromProperties("phone"));
		Thread.sleep(1000);
		page.getFinalLoginLink().click();
		Thread.sleep(12000);
		page.getOtpTextbox().sendKeys("");
		Thread.sleep(1000);
		page.getVerifyLoginLink().click();
		Thread.sleep(1000);


		
	}
}
