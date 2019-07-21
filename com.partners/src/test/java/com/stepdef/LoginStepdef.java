package com.stepdef;

import com.actions.LoginActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {
	
	LoginActions LA = new LoginActions();
	
	

@Given("^User will be on the homepage$")
public void user_will_be_on_the_homepage() throws Throwable {
    
    LA.pagelink();
}

@When("^User click on signin button$")
public void user_click_on_signin_button() throws Throwable {
    LA.Loginclick();
    
}

@When("^User will put \"([^\"]*)\"$")
public void user_will_put(String UserId) throws Throwable {
    LA.UserName(UserId);
    
}

@When("^User will input \"([^\"]*)\"$")
public void user_will_input(String Password) throws Throwable {
   LA.Password(Password); 
    
}

@When("^User will hit on signin button$")
public void user_will_hit_on_signin_button() throws Throwable {
   LA.LoginButton(); 
    
}
@Then("^User will see the \"([^\"]*)\" message$")
public void user_will_see_the_message(String Error) throws Throwable {
    LA.ErrorMessage(Error);
}



	
	}
