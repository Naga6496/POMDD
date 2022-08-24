package com.Credor.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import com.Credor.qa.actions.CommonActions;
//import com.Credor.qa.utilities.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCode {

	 public static WebDriver driver;
	 public static Properties prop;
	
	//public static void main(String[] args) throws IOException {
	
	//Super class Constructor***:
	public BaseCode() {
		try {
			//Configuring Properties in Base class***:
			 prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\EICPL02-L232\\eclipse-workspace\\POMDD\\src\\main\\java\\com\\Credor\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void launchapplication() {	
		
		
		//Initializing the Driver as Chrome/Firefox***:
	
		//System.setProperty("WebDriver.chrome.driver", "F:\\Workspace\\POMbase\\POMDD\\Driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver = WebDriver.Chrome(ChromeDriverManager().install());
		//driver.get(prop.getProperty("url"));
		//driver.get("https://www.google.com/");
		//Chrome Browser Managing commands***:
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.Time_Page_Load, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.Time_Implicit_Wait, TimeUnit.SECONDS);
		
		//CommonActions.pageLoadTimeOut(driver, 10);
		//CommonActions.implicitWait(driver, 20);
		
		//String browsername = prop.getProperty("browser");
		/*if(browsername.equals ("chrome")) {
		System.setProperty("Webdriver.chrome.driver", "/Driver");
		driver = new ChromeDriver();
		}
		else if (browsername.equals("Firefox")) {
			System.setProperty("Webdriver.gecko.driver","/Driver");
			driver = new FirefoxDriver();
		}*/
		
		
		WebDriverManager.chromedriver().driverVersion("103.0.5060.53").setup();
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); 
		options.addArguments("enable-automation"); 
		options.addArguments("--no-sandbox"); 
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-browser-side-navigation"); 
		options.addArguments("--disable-gpu"); */
		driver = new ChromeDriver(); 
		driver.get("https://credor-app.azurewebsites.net/login"); 
		driver.manage().window().maximize();
		
	}

}
