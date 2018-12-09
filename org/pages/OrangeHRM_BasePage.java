package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_BasePage {

		public WebDriver driver;
		
		public OrangeHRM_BasePage() {}
		
		public OrangeHRM_BasePage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);	
	}
}