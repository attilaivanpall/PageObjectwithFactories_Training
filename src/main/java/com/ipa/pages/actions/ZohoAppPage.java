package com.ipa.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ipa.base.Page;
import com.ipa.pages.locators.ZohoAppPageLocators;

public class ZohoAppPage extends Page{

	
	ZohoAppPageLocators zohoAppPage;
	
	public ZohoAppPage() {
		
		this.zohoAppPage = new ZohoAppPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.zohoAppPage);
		
	}
	
	
	
	public CRMHomePage goToCRM() {
		
		zohoAppPage.crmBtn.click();
		
		return new CRMHomePage();
		
	}
	
	
	
	
	
}
