package com.ipa.base;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ipa.pages.actions.AccountsPage;
import com.ipa.pages.actions.CRMHomePage;
import com.ipa.pages.locators.TopMenuLocators;

public class TopMenu {

	TopMenuLocators topMenu;
	
	public TopMenu() {
		
		this.topMenu = new TopMenuLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.driver, 10);
		PageFactory.initElements(factory, this.topMenu);
		
	}
	
	
	public CRMHomePage goToCRMHome() {
		
		topMenu.homeMenu.click();
		
		return new CRMHomePage();
		
	}
	
	
	public AccountsPage goToAccountsPage() {
		
		topMenu.accountsMenu.click();
		
		return new AccountsPage();
	}
	
	
}
