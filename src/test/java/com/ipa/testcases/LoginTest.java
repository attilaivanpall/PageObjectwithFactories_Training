package com.ipa.testcases;

import org.testng.annotations.Test;

import com.ipa.base.Page;
import com.ipa.pages.actions.CRMHomePage;
import com.ipa.pages.actions.HomePage;
import com.ipa.pages.actions.LoginPage;
import com.ipa.pages.actions.TrustPage;
import com.ipa.pages.actions.ZohoAppPage;

public class LoginTest {

	
	public static void main(String[] args) throws InterruptedException {
	
	
		Page.initConfiguration();
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		TrustPage trust = login.doLogin("wanarialajos@gmail.com", "wanaritest12");
		ZohoAppPage zohoAppPage = trust.goToZohoAppPage();
		zohoAppPage.goToCRM();
		Thread.sleep(5000);
		Page.quitBrowser();
		
	
	}
}
