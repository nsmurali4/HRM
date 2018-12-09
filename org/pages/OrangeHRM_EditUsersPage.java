package org.pages;

import org.Utils.OrangeHRM_Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM_EditUsersPage extends OrangeHRM_BasePage {

	@FindBy(xpath=OrangeHRM_Constants.editUser)
	 private WebElement editUser;
	 @FindBy(xpath=OrangeHRM_Constants.saveUser)
	 private WebElement saveUser;
	 
	 public OrangeHRM_EditUsersPage(WebDriver driver){
	  super(driver);
	 }
	 
	 public void editUserdetails(){
	  
	  editUser.click();
	  saveUser.click();
	  
	  ///editing code
	 }
	 
	 

	}

