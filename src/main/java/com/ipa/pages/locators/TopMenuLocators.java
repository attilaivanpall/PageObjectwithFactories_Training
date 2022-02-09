package com.ipa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuLocators {

	@FindBy(css = "div[data-value = 'Home'] > a")
	public static WebElement homeMenu;
	
	@FindBy(css = "div[data-value = 'Leads'] > a")
	public static WebElement leadsMenu;
	
	@FindBy(css = "div[data-value = 'Contacts'] > a")
	public static WebElement contactsMenu;
	
	@FindBy(css = "div[data-value = 'Accounts'] > a")
	public static WebElement accountsMenu;
	
	@FindBy(css = "div[data-value = 'Potentials'] > a")
	public static WebElement dealsMenu;
	
}
