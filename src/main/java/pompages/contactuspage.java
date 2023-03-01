package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactuspage {
	//declaration
	@FindBy(xpath="//img[contains(@src,'contactus']")
	private WebElement pageheader;
	@FindBy(name="name")
	private WebElement fullnametf;
	@FindBy(name="sender")
	private WebElement emailtf;
	@FindBy(name="subject")
	private WebElement subjecttf;
	@FindBy(name="message")
	private WebElement messageArea;
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendUsMailButton;
	
	
	
	
	//initialization
	public contactuspage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
		
	}
	//utilization
	public WebElement getPageHeader()
	{
		return pageheader;
		
	}
	public void sendContactDetails(String name,String email,String subject,String message)
	{
	    fullnametf.sendKeys(name);
	    emailtf.sendKeys(email);
	    subjecttf.sendKeys(subject);
	    messageArea.sendKeys(message);
	    sendUsMailButton.click();
		
	}
	

}








