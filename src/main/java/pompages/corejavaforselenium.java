package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class corejavaforselenium {
	//declaration
	@FindBy(xpath="//h2[@class='list_title']")
	private WebElement pageheader;
	@FindBy(xpath="//a[text()=' Core Java For Selenium Training']")
	private WebElement corejavaforseleniumlink;
	
	
	
	
	
	//initialization
	public corejavaforselenium(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
		
	}
	//utilization
	public String getPageHeader()
	{
		return pageheader.getText();
		
	}
public void clickcorejavaforseleniumlink()
	
	{
	

	corejavaforseleniumlink.click();
}


}











