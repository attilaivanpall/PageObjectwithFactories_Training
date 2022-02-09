package com.ipa.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ipa.base.Page;
import com.ipa.pages.locators.TrustPageLocators;

public class TrustPage extends Page{

	TrustPageLocators trustPage;
	
	public TrustPage() {
		
		this.trustPage = new TrustPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.trustPage);
		
	}
	
	
	
	public ZohoAppPage goToZohoAppPage() {
		
		TrustPageLocators.trustBtn.click();
		
		return new ZohoAppPage();
		
	}
	
	
}
