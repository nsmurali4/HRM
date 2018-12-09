package org.pages;

import org.Utils.OrangeHRM_Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_BaseTestCase {

	public WebDriver driver;

	public void init(String browserType) throws InterruptedException {
		
		if (browserType == "Chrome") {
			
			System.setProperty("webdriver.chrome.driver", OrangeHRM_Constants.ChromeDriver_Path);
			driver = new ChromeDriver(); 
			driver.get(OrangeHRM_Constants.urlUAT);
			}
			}
}