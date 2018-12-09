package org.pages;

import org.Utils.OrangeHRM_Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM_UsersPage extends OrangeHRM_BasePage {

	 @FindBy(xpath=OrangeHRM_Constants.searchusername)
	 private WebElement searchusername;
	 @FindBy(xpath=OrangeHRM_Constants.searchbutton)
	 private WebElement searchbutton;
	 @FindBy(xpath=OrangeHRM_Constants.selectUserRoleAll)
	 private WebElement selectUserRoleAll;	 
	 @FindBy(xpath=OrangeHRM_Constants.selectUserRoleAdmin)
	 private WebElement selectUserRoleAdmin;	 
	 @FindBy(xpath=OrangeHRM_Constants.selectUserRoleESS)
	 private WebElement selectUserRoleESS;
	 @FindBy(xpath=OrangeHRM_Constants.searchEmployeeName)
	 private WebElement searchEmployeeName;	 
	 @FindBy(xpath=OrangeHRM_Constants.selectStatusAll)
	 private WebElement selectStatusAll;	 
	 @FindBy(xpath=OrangeHRM_Constants.selectStatusEnabled)
	 private WebElement selectStatusEnabled;	 
	 @FindBy(xpath=OrangeHRM_Constants.selectStatusDisabled)
	 private WebElement selectStatusDisabled;	 
	 @FindBy(xpath=OrangeHRM_Constants.chkSelectAll)
	 private WebElement chkSelectAll;
	 @FindBy(xpath=OrangeHRM_Constants.sortUsername)
	 private WebElement sortUsername;	 
	 @FindBy(xpath=OrangeHRM_Constants.sortUserRole)
	 private WebElement sortUserRole;	 
	 @FindBy(xpath=OrangeHRM_Constants.sortEmployeeName)
	 private WebElement sortEmployeeName;	 
	 @FindBy(xpath=OrangeHRM_Constants.sortStatus)
	 private WebElement sortStatus;	 
	 @FindBy(xpath=OrangeHRM_Constants.btnAdd)
	 private WebElement btnAdd;	 
	 @FindBy(xpath=OrangeHRM_Constants.btnDelete)
	 private WebElement btnDelete;	 
	 @FindBy(xpath=OrangeHRM_Constants.reset)
	 private WebElement reset;
	 
	 public OrangeHRM_UsersPage(WebDriver driver){
	  super(driver);
	 }
	 
	 public OrangeHRM_AddUsersPage gotoaddNewUser(){
	  btnAdd.click();
	  btnDelete.click();
	  return new OrangeHRM_AddUsersPage();
	 }
	 
	 public void doSearch(String username){
	  searchusername.sendKeys(username);
	  searchbutton.click();
	 }
	 
	 public void doSearchUserRole(WebElement userrole){
	  selectUserRoleAll.click();
	  searchbutton.click();
	  selectUserRoleAdmin.click();
	  searchbutton.click();
	  selectUserRoleESS.click();
	  searchbutton.click();
	 }
	 
	 public void doSearchEmployeeName(String employeename){
	 searchEmployeeName.sendKeys(employeename);
	 searchbutton.click();
	 }
	 
	 public void doSearchStatus(WebElement status){
		  selectStatusAll.click();
		  searchbutton.click();
		  selectStatusEnabled.click();
		  searchbutton.click();
		  selectStatusDisabled.click();
		  searchbutton.click();
	 }
	 
	 public void chkSelectAll(WebElement selectAll){
	 chkSelectAll.click();
	 }
	 
	 public void sortAll(WebElement sortAll){
	 sortUsername.click();
	 sortUserRole.click();
	 sortEmployeeName.click();
	 sortStatus.click();
	 }
	 
	 
	 public Object gotoviewUserDetails(){
	  	   
	  //clickLinkByHref(username);
	  reset.click();
	  
	   return new OrangeHRM_EditUsersPage(driver);
	  
	 }
	 
	}


