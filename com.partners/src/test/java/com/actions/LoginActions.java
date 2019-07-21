package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.elements.LoginElements;
import com.utilities.Driver;

public class LoginActions {


  LoginElements FLE;
  public LoginActions(){
    this.FLE = new LoginElements();

PageFactory.initElements(Driver.driver, FLE);
}

//Website link 
public void pagelink() {
	Driver.driver.get("https://www.fedex.com/en-us/home.html"); 
		 
 }
 //login signup navigate
public void Loginclick() {
  FLE.signin.click();
    	
}
// username
public void UserName(String Username) {
	FLE.username.sendKeys(Username);
	
}
// password
public void Password(String Password) {
	FLE.password.sendKeys(Password);
	
}
// signin button click

public void LoginButton() {
	FLE.SigninButton.click();
	
}
// error message
public void ErrorMessage(String Emessage ) {
	FLE.ErrorMsg.getText();
	System.out.println("got the text= "+Emessage);
}

}
