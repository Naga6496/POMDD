package com.Credor.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Credor.qa.actions.CommonActions;
import com.Credor.qa.base.BaseCode;


//extends --> informing this LoginPage class is child of BaseCode class***
public class LoginPage extends BaseCode{
	
	//LoginPage Elements --> page factory method*** @Findby(Key = "value")
	
	//Objects Repository:
	
	//public static loginemail loginemail;
	
	@FindBy(id="login_email")
	 WebElement loginemail;

	@FindBy(id="login_password")
	WebElement password;
	
	@FindBy(id="login_submit")
	WebElement loginbutton;
	
	@FindBy(xpath = "//img[contains(@class,'logoimg')]")
	WebElement Credorlogo;
	
	//Initializing Page Objects:
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions Method:
	
	public PrivacyPolicy login(String email, String pwd) {
		loginemail.sendKeys(email);
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new PrivacyPolicy();
	}
	
	public boolean vaildateCredorImg() {
		return Credorlogo.isDisplayed();
	}
	
	
}
