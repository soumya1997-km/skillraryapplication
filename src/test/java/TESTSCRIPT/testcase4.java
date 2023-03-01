package TESTSCRIPT;

import java.util.List;

import org.testng.asserts.SoftAssert;

import genericlibraries.baseclass;
import pompages.contactuspage;

public class testcase4 extends baseclass {
	
	public void fourthtest()
	{
		SoftAssert soft=new SoftAssert();
		
	home.clickGears();
	home.clickSkillraryDemoApp();
	web.switchToChildBrowser();
	soft.assertEquals(skillraryDemo.getPageHeader(),"SkillRary-ECommerce" );
	web.scrollToElement(skillraryDemo.clickContactUs());
	skillraryDemo.clickContactUs();
	soft.assertTrue(contactus.pageHeader().isDisplayed());
	List<String>data=excel.readDataFromExcel("Sheet1");
	contactus.submitDetails(data.get(0),data.get(1),data.get(2),data.get(3));
	soft.assertAll();
	}
}
