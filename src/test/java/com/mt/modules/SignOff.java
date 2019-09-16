package com.mt.modules;

import org.testng.annotations.Test;

import com.mt.pages.FlightFinderPage;
import com.mt.utility.CloseBrowser;

public class SignOff {
  @Test(priority=3)
  public void executeSignOff() throws InterruptedException 
  {
	  FlightFinderPage ff=new FlightFinderPage();
	  
	  ff.loadFlightFinderpage();
	  ff.verifyFlightFinderimg();
	  ff.clickonSignoff();
	  
	  Thread.sleep(5000);
	  
	  CloseBrowser cb=new CloseBrowser();
	  cb.closeBrowser();
				
  }
}
