package com.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utilities.Driver;


public class LoginElements {
   Driver fed = new Driver();
	
	
	@FindBy(css="#global-login-wrapper > a > div > span")
	public WebElement signin;
	
	@FindBy(id="NavLoginUserId")
	public WebElement username;
	
	@FindBy(id="NavLoginPassword")
	public WebElement password;
	
	@FindBy(css="#HeaderLogin > button")
	public WebElement SigninButton;
	
	@FindBy(xpath="//*[@id=\"loginNoErrorFillMsg\"]/text()[1]")
	public WebElement ErrorMsg;
}
