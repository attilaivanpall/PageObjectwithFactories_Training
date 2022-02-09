package com.ipa.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ipa.base.Page;
import com.ipa.pages.locators.CRMHomePageLocators;

public class CRMHomePage extends Page{

	CRMHomePageLocators crm;
	
	
	public CRMHomePage() {
		
	this.crm = new CRMHomePageLocators();	
	AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
	PageFactory.initElements(factory, this.crm);
	
	}
	
	
	
	
	
}
