package com.ipa.testcases;

import com.ipa.base.Page;
import com.ipa.pages.actions.HomePage;
import com.ipa.pages.actions.LoginPage;

public class LoginTest {

	
	public static void main(String[] args) {
		
		
		Page.initConfiguration();
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		login.doLogin("wanarialajos@gmail.com", "wanaritest12");
		Page.quitBrowser();
		
	}
}
