
	
	//@BeforeSuite   becoz no parallel execution
	//@BeforeTest


	//@AfterTest
	//@AfterSuite becoz no db connection
	
	
	package genericlibraries;

	import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

	import pompages.contactuspage;
	import pompages.corejavaforselenium;
	import pompages.corejavavideopage;
	import pompages.homepage;
	import pompages.SeleniumTrainingpage;
	import pompages.skillraryDemoApppage;
	import pompages.testingpage;

	public class baseclass 
	{
		protected propertiesUtility property;
		protected excelUtility excel;
		protected WEBDRIVERuTILITY web;
		protected WebDriver driver;
		protected homepage home;
		protected skillraryDemoApppage skillraryDemo;
		protected SeleniumTrainingpage selenium;
		protected corejavaforselenium corejava;
		protected corejavavideopage javavideo;
		protected testingpage testing;
		protected contactuspage contact;
		
		
		//@BeforeSuite
		//@BeforeTest
		@BeforeClass
		 public void classConfiguration()
		 {
			 property= new propertiesUtility();
			 excel= new excelUtility();
			 web= new WEBDRIVERuTILITY();
			 
			 property.propertiesInitialization(IConstantPath.PROPERTIES_FILE_PATH);
			 excel.excelIntialization(IConstantPath.EXCEL_FILE_PATH);
			 
			 
			 
		 }
		
		@BeforeMethod
		public void methodConfiguration()
		{
			long time= Long.parseLong(property.fetchProperty("timeouts"));
			 driver=web.openApplication(property.fetchProperty("browser"), 
					 property.fetchProperty("url"), time);
			 
			 home= new homepage(driver);
			 Assert.assertTrue(home.getLogo().isDisplayed());
			 skillraryDemo= new skillraryDemoApppage(driver);
			 selenium=new SeleniumTrainingpage(driver);
			 corejava=new corejavaforselenium(driver);
			 javavideo=new corejavavideopage(driver);
			 testing=new testingpage(driver);
			 contact = new contactuspage(driver); 
			 
		}
		@AfterMethod
		public void methodTearDown()
		{
			web.quitBrowser();
		}
		@AfterClass
		public void classTearDown()
		{
			excel.closeExcel();
		}
		//@AfterTest
		//@AfterSuite
	}



	
	
	
	
	
	
	
	
	
	


