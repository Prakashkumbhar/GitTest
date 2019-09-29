package com.newtours.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserObject {
	
	static WebDriver driver;
	public static WebDriver get(String browserName) throws Exception {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver= new ChromeDriver();
		}else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\InternetExplorer.exe");
			driver= new InternetExplorerDriver();
		}else if( browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\gfirefox.exe");
			driver= new FirefoxDriver();
		}else {
			throw new Exception("Invalid browser name :"+ browserName);
		}
		return driver;
	}
}
