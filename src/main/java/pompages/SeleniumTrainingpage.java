package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WEBDRIVERuTILITY;

public class SeleniumTrainingpage {
	
	//declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageheader;
	@FindBy(id="add")
	private WebElement plusButton;
	@FindBy(xpath="//button[.=' Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath= "//div[@id=' callout']")
	private WebElement itemAddedMessage;
	
	
	//initialization
	public SeleniumTrainingpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	//utilization
	public String getPageHeader()
	{
		return pageheader.getText();
		
	}
	public void doubleClickPlusButton(WEBDRIVERuTILITY web)
	{
		web.doubleClickOnElement(plusButton);
		
	}
	public void clickAddToCart()
	{
		addToCartButton.click();
		
	}
	public WebElement getItemAddedMessage()
	{
		return itemAddedMessage;
	}
	

}
