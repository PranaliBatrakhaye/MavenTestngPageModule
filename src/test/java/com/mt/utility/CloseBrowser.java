package com.mt.utility;



import com.mt.config.Config;

public class CloseBrowser {
  
  public void closeBrowser() {
	  
	  	Config.driver.quit();
		System.out.println("Browser closed");
  }
}
