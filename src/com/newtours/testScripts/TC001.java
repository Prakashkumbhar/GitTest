package com.newtours.testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.newtours.objectRepo.ObjectRepository;
import com.newtours.pageObjects.Login;
import com.newtours.utilities.BrowserObject;

public class TC001 {
	static WebDriver browser;
	
  @Test
  public void login() throws Exception {
	 browser =BrowserObject.get(ObjectRepository.browser);
	  browser.get(ObjectRepository.url);
	  Login.enterUsername(browser, "batman");
	  Login.enterPassword(browser, "batman");
	  Login.clicklogin(browser);
	  
  }
}
