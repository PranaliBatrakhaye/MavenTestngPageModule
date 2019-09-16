package com.mt.modules;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mt.pages.LoginPage;
import com.mt.utility.Screenshots;

public class Login {
	
	@Parameters ({"usernm","passwd"})
	@Test(priority=2)
	public void executeLogin(String username,String password) throws IOException
	{
		LoginPage lgpg= new LoginPage();
		lgpg.loadLoginPage();
		lgpg.enterUsername(username);
		lgpg.enterPassword(password);
		lgpg.clickonLogin();
		
		Screenshots ss=new Screenshots();
		ss.CaptureScreenshot();
}
}