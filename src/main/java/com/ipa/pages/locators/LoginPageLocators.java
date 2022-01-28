package com.ipa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	
	@FindBy(id = "login_id")
	public WebElement loginFld;
	
	@FindBy(id = "nextbtn")
	public WebElement nextBtn;
	
	@FindBy(id = "password")
	public WebElement passwordFld;
	
	
	
}
