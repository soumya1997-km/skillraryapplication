package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class corejavavideopage {
	@FindBy(xpath="//h2[@class='list_title']")
	private WebElement pageheader;
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playButton;
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pauseButton;
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addTowishlisttab;
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement closecookiesicon;
	
	
	
	
	
	//initialization
	public corejavavideopage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
		
	}
	//utilization
	public String getPageHeader()
	{
		return pageheader.getText();
		
	}
public void clickplaybutton()
	
	{
		playButton.click();
	}
public void clickpausebutton()

{
	pauseButton.click();
}
public void clickaddtowishlist()

{
	addTowishlisttab.click();
}
public void clickclosecookies()

{
	closecookiesicon.click();
}


}











