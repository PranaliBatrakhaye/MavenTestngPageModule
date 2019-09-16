package com.mt.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mt.config.Config;

public class LaunchApp 
{	
	Properties prop=new Properties();
	{
		System.out.println(1);
	}

	
	public void openBrowser(String browsernm) throws IOException
	{
		System.out.println(2);
		FileInputStream fis=new FileInputStream("E:\\eclipse\\MavenTestngPageModule\\src\\test\\resources\\config.properties");
		prop.load(fis);
		if(browsernm.equalsIgnoreCase("chrome"))
		{
			System.out.println(3);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeexepath"));
		Config.driver=new ChromeDriver();
		System.out.println("Chrome browser is up");
		}
	}
	
	public void enterAppURL(String url)
	{
		System.out.println(3);
		Config.driver.get(url);
		System.out.println("URL entered");
	}
	
	public void maximize()
	{
		Config.driver.manage().window().maximize();
		System.out.println("Window maximized");
	}
	
	public void waitTillPageup(int time)
	{
		Config.driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
		System.out.println("Page waiting to up");
	}
	
	
}
