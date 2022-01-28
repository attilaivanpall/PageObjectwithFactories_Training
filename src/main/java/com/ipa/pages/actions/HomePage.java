package com.ipa.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ipa.base.Page;
import com.ipa.pages.locators.HomePageLocators;

public class HomePage extends Page{

	public HomePageLocators home;
	
	public HomePage() {
		
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
		
		
	}
	
	public LoginPage goToLogin() {
		
		home.loginBtn.click();
		
		return new LoginPage();
	}
	
	
	
}
