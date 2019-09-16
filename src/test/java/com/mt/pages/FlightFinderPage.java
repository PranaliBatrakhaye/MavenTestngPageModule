package com.mt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mt.config.Config;

public class FlightFinderPage 
{
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objflightfinder;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objsignoff;		
	
	public void loadFlightFinderpage()
	{
		PageFactory.initElements(Config.driver, this);
		
	}
	
	public void verifyFlightFinderimg()
	{
		boolean flag=objflightfinder.isDisplayed();
		System.out.println("Flight finder image is displayed");
	}
	
	public void clickonSignoff()
	{
		objsignoff.click();
	}	

}
