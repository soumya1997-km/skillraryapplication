package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WEBDRIVERuTILITY;

public class testingpage {
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageheader;
	@FindBy(xpath="//img[@id='java']")
	private WebElement javaImage;
	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement myCartArea;
	@FindBy(xpath= "//footer/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	
	
	//initialization
	public testingpage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
		
	}
	//utilization
	public String getPageHeader()
	{
		return pageheader.getText();
		
	}
	public WebElement getJavaImage()
	{
	    return javaImage;
		
	}
	public WebElement getMyCartArea()
	{
		return myCartArea;
		
	}
	public void clickFacebookIcon()
	{
		facebookIcon.click();
		
	}
	

}




