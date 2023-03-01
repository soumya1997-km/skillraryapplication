package TESTSCRIPT;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.baseclass;


	
	public class TESTCASE1 extends baseclass
	{
		@Test
		public void firsttest()
		{
			SoftAssert soft=new SoftAssert();
			
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.switchToChildBrowser();
		soft.assertEquals(skillraryDemo.getPageHeader(),"SkillRary-ECommerce" );
		skillraryDemo.mouseHoverToCourse(web);
		skillraryDemo.clickSeleniumTraining();
		soft.assertEquals(selenium.getPageHeader(),"Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.takeScreenshot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		soft.assertAll();
	}

}
