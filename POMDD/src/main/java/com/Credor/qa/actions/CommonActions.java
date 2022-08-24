package com.Credor.qa.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Credor.qa.base.BaseCode;

public class CommonActions extends BaseCode {
	Actions actions;
	
	public static void click(WebDriver Driver, WebElement Locatorname) {
		Actions action = new Actions(driver);
		action.moveToElement(Locatorname).click().build().perform();
	}
	
	public static void implicitWait(WebDriver driver, int timeOut) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void explicitWait(WebDriver driver, WebElement element, int timeOut ) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void pageLoadTimeOut(WebDriver driver, int timeOut) {
		driver.manage().timeouts().pageLoadTimeout(timeOut, TimeUnit.SECONDS);
	}
	
	public static void windowmaximize(WebDriver driver) {
		driver.manage().window().maximize();
		
	}

	/*public void login(String un, String pwd) {
		loginemail.sendKeys(un);
		password.sendKeys(pwd);*/
}