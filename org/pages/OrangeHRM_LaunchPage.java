package org.pages;

import org.Utils.OrangeHRM_Constants;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_LaunchPage extends OrangeHRM_BasePage{
	
		
	public OrangeHRM_LaunchPage(WebDriver driver){
		  super(driver);
		 }
		  
		  public OrangeHRM_LoginPage gotologinPage(){
		
		  driver.get(OrangeHRM_Constants.urlUAT);
		  
		  return new OrangeHRM_LoginPage(driver);
		 }

		}
		 