package com.mt.modules;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mt.utility.CloseBrowser;
import com.mt.utility.LaunchApp;
import com.mt.utility.Screenshots;

public class Launch {
	
	@Parameters ({"browsernm","URL","sec"})
	@Test(priority=1)
	public void executeLaunch(String browsername,String urlnm,int seconds) throws IOException
	{
		LaunchApp lc= new LaunchApp();
		lc.openBrowser(browsername);
		lc.enterAppURL(urlnm);
		lc.maximize();
		lc.waitTillPageup(seconds);
		
		Screenshots ss=new Screenshots();
		ss.CaptureScreenshot();
	}
}
