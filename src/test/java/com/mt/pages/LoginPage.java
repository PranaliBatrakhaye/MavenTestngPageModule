package com.mt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mt.config.Config;

public class LoginPage 
{
	 @FindBy(how=How.XPATH,using="//input[@name='userName']")
	 WebElement objusername;
	 
	 @FindBy(how=How.XPATH,using="//input[@name='password']")
	 WebElement objpassword;
	 
	 @FindBy(how=How.XPATH,using="//input[@name='login']")
	 WebElement objlogin;

	public void loadLoginPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUsername(String username)
	{
		objusername.sendKeys(username);
		System.out.println("Username is entered successfully");
	}
	
	public void enterPassword(String password)
	{
		objpassword.sendKeys(password);
		System.out.println("Password is entered successfully");
	}
	
	public void clickonLogin()
	{
		objlogin.click();
	}
		
}
