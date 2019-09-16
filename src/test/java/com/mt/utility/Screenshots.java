package com.mt.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.mt.config.Config;

public class Screenshots {
 
  public void CaptureScreenshot() throws IOException 
  {
	  File src=((TakesScreenshot)Config.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("E:\\eclipse\\MavenTestngPageModule\\src\\test\\resources\\Screenshots\\"));
		System.out.println("Screenshot Captured");
  }
}
