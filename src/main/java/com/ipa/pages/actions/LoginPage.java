package com.ipa.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ipa.base.Page;
import com.ipa.pages.locators.LoginPageLocators;

public class LoginPage extends Page{

	LoginPageLocators loginPage;
	
	public LoginPage() {
		
		this.loginPage = new LoginPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.loginPage);
		
		
	}
	
	public TrustPage doLogin(String username, String password) {
		
		loginPage.loginFld.sendKeys(username);
		loginPage.nextBtn.click();
		loginPage.passwordFld.sendKeys(password);
		loginPage.nextBtn.click();
		
		return new TrustPage();
	}
}
