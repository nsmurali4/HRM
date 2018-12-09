package org.pages;

import org.Utils.OrangeHRM_Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM_LoginPage extends OrangeHRM_BasePage{
	 
	 @FindBy(xpath=OrangeHRM_Constants.UserName)
	 private WebElement UserName;
	 @FindBy(xpath=OrangeHRM_Constants.Password)
	 private WebElement Password;
	 @FindBy(xpath=OrangeHRM_Constants.Login)
	 private WebElement Login;
	 
	 public OrangeHRM_LoginPage(WebDriver driver){
	  super(driver);
	 }
	 
	 public OrangeHRM_HomePage doLogin(String username, String password){
	 UserName.sendKeys(username);
	 Password.sendKeys(password);
	 Login.click();
	  
	 return new OrangeHRM_HomePage(driver); 
	  
	 }
}