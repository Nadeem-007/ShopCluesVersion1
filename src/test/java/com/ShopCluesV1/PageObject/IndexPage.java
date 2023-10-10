package com.ShopCluesV1.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

	WebDriver driver;
	
	public IndexPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//==============>Register Functionality
	@FindBy(linkText = "Sign In")
	private WebElement siginLink;
	
	@FindBy(xpath="//div/button[text()=\"Don't Allow\"]")
	private WebElement popUp;
	
	@FindBy(id="reg_tab")
	private WebElement registerTab;
	
	@FindBy(name ="email")
	private WebElement emailTxtField;
	
	@FindBy(name = "phone")
	private WebElement phoneTxtField;
	
	@FindBy(id="register_with_password")
	private WebElement checkbox;
	
	@FindBy(name="password")
	private WebElement pwdTxtField;
	
	@FindBy(id="register_button")
	private WebElement registerLink;
	
	
	
	
	//=============> Login Functionality
	
	@FindBy(id="main_user_login")
	private WebElement emailIdForLogin;
	
	@FindBy(id="login_via_otp")
	private WebElement loginLink;
	
	@FindBy(id="user_login")
	private WebElement mobileTxtField;
	
	@FindBy(xpath="//div/input[@class=\"btn orange\"]")
	private WebElement finalLoginLink;
	
	@FindBy(name="otp")
	private WebElement otpTextbox;
	
	@FindBy(xpath="//a[text()=\"Verify & Login\"]")
	private WebElement verifyLoginLink;
	
	
	
	
	//============== Methods for Register
	public WebElement getSigninLink() {
		return siginLink;
	}
	
	public WebElement getPopUp() {
		return popUp;
	}
	
	public WebElement getRegisterTab() {
		return registerTab;
	}
	public WebElement getEmailTxtField() {
		return emailTxtField;
	}
	
	public WebElement getPhoneTxtField() {
		return phoneTxtField;
	}
	
	public WebElement getCheckbox() {
		return checkbox;
	}
	
	public WebElement getPassword() {
		return pwdTxtField;
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	
	
	
	//=============> Methods for Login
	public WebElement getEmailIdForLogin() {
		return emailIdForLogin;
	}
	
	public WebElement getLoginLink() {
		return loginLink;
	}
	
	public WebElement getMobileTxtField() {
		return mobileTxtField;
	}
	
	public WebElement getFinalLoginLink() {
		return finalLoginLink;
	}
	
	public WebElement getOtpTextbox() {
		return otpTextbox;
	}
	
	public WebElement getVerifyLoginLink() {
		return verifyLoginLink;
	}
}
