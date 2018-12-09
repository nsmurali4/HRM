package org.test;

import org.pages.OrangeHRM_BaseTestCase;
import org.pages.OrangeHRM_EditUsersPage;
import org.pages.OrangeHRM_HomePage;
import org.pages.OrangeHRM_LaunchPage;
import org.pages.OrangeHRM_LoginPage;
import org.pages.OrangeHRM_UsersPage;
import org.testng.annotations.Test;

public class OrangeHRM_TestCase extends OrangeHRM_BaseTestCase {
	 
	 public OrangeHRM_TestCase() throws InterruptedException {
	  super();
	 }

	 @Test
	 public void doLogin() throws InterruptedException{
	  
	  OrangeHRM_LaunchPage launchPage =new OrangeHRM_LaunchPage(driver);
	  OrangeHRM_LoginPage homepage = launchPage.gotologinPage();
	  Object page = homepage.doLogin("Admin", "admin123");
	  page = ((OrangeHRM_HomePage) page).gotoUsersPage();
	  ((OrangeHRM_UsersPage) page).doSearch("test0");
	  page = ((OrangeHRM_UsersPage) page).gotoviewUserDetails();
	  ((OrangeHRM_EditUsersPage) page).editUserdetails();
	     
	 }
	}


