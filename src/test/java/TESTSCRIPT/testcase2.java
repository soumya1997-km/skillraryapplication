package TESTSCRIPT;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.baseclass;

public class testcase2 extends baseclass {

			@Test
			public void secondTest()
			{
				SoftAssert soft = new SoftAssert();
				
				home.clickGears();
				home.clickSkillraryDemoApp();
				web.switchToChildBrowser();
				
				
				soft.assertEquals(skillraryDemo.getPageHeader(), "SkillRary-ECommerce");
				skillraryDemo.selectCategory(web, 1);
				
				soft.assertEquals(testing.getPageHeader(), "Testing");//checkig page is appearing or not
				web.dragAndDropElement(testing.getJavaImage(), testing.getMyCartArea());
				web.scrollToElement(testing.clickFacebookIcon());
				testing.clickFacebookIcon();
				soft.assertAll();
				
				
				
				
			}
		}