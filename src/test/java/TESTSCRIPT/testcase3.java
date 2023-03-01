package TESTSCRIPT;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.baseclass;

public class testcase3 extends baseclass {
	@Test
	public void thirdTest() throws InterruptedException{
	SoftAssert soft = new SoftAssert();

	home.searchFor("core java for selenium");
	soft.assertEquals(corejava.getPageHeader(), "CORE JAVA FOR SELENIUM");
	corejava.clickcorejavaforseleniumlink();
	soft.assertEquals(javavideo.getPageHeader(), "Core Java For Selenium Training");

	javavideo.clickclosecookies();
	web.switchToFrame();
	javavideo.clickplaybutton();
	Thread.sleep(2000);
	javavideo.clickaddtowishlist();

	web.switchBackFromFrame();
	javavideo.clickaddtowishlist();
	soft.assertAll();


	}
	

}
