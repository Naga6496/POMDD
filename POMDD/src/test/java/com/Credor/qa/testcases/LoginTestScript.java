package com.Credor.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Credor.qa.base.BaseCode;
import com.Credor.qa.pages.LoginPage;
import com.Credor.qa.pages.PrivacyPolicy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestScript extends BaseCode{
	LoginPage loginpage;
	PrivacyPolicy privacypolicy;
	
	
	public LoginTestScript () {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		launchapplication ();
		loginpage =new LoginPage();
		
		//Create the Object of Login page class constructor:
		
	}
/*	
@Test (priority=2)
	public void Credorimagetest() {
		boolean flag = loginpage.vaildateCredorImg();
		Assert.assertTrue(flag);	
	}*/
	
	@Test 
	public void logintest() {
//		loginpage =new LoginPage();
		loginpage.login(prop.getProperty("loginemail"),prop.getProperty("password"));
		
//		privacypolicy = new LoginPage();
		
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
		
	}
	
	
	
	
	
}
