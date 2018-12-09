package org.pages;

import org.Utils.OrangeHRM_Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM_HomePage extends OrangeHRM_BasePage{
	 
	 @FindBy(xpath=OrangeHRM_Constants.mAdmin)
	 private WebElement mAdmin;
	 @FindBy(xpath=OrangeHRM_Constants.msUsersManagement)
	 private WebElement msUserManagement;
	 @FindBy(xpath=OrangeHRM_Constants.mssUsers)
	 private WebElement mssUsers;
	;
	 
	 public OrangeHRM_HomePage(WebDriver driver){
	  super(driver);
	 }
	 
	 public OrangeHRM_UsersPage gotoUsersPage(){
	  mAdmin.click();
	  msUserManagement.click();
	  mssUsers.click();
	  return new OrangeHRM_UsersPage(driver);
	 }

	 
	}
