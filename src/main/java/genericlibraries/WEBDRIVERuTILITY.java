package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * this class contains reusable methods of webdriver
 * @author MOHAN
 *
 */

public class WEBDRIVERuTILITY {
	private WebDriver driver;
	
	/** this method is used to navigate to an application according to the user desired browser selection
	 * 
	 * @param browser
	 * @param url
	 * @param time
	 * @return
	 */
	public WebDriver openApplication(String browser,String url,long time)
	{
		switch(browser)
		{
		case "chrome": driver=new ChromeDriver();
		break;
		case "firefox":driver=new FirefoxDriver();
		break;
		case "edge":driver=new EdgeDriver();
		break;
		default:System.out.println("Invalid browser data");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		return driver;
	}
	/**this method is used to wait until the visibility of particular element ie
	 * explicit wait
	 * @param element
	 * @param time
	 * @return
	 */
		
		public WebElement explicitWait(WebElement element,long time)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			 return wait.until(ExpectedConditions.visibilityOf(element));
			
		}
		/** this method is used to perform mousehover action on an element
		 * 
		 * @param element
		 */
		public void mouseHover(WebElement element)
		{
			Actions a =new Actions(driver);
			a.moveToElement(element).perform();
		}
		/**
		 *this method is used to perform  doubleclick action on an element
		 * @param element
		 */
		
		public void doubleClickOnElement(WebElement element)
		{
			Actions a =new Actions(driver);
			a.doubleClick(element).perform();
		}
		/** this method is used to perform drag and drop of an element from src to target
		 * 
		 * @param source
		 * @param target
		 */
		public void dragAndDropElement(WebElement source,WebElement target)
		{
			Actions a =new Actions(driver);
			a.dragAndDrop(source,target).perform();
		}
		/**
		 * this method is used to select an element from  dropdowns based on index
		 * @param element
		 * @param index
		 */
		public void dropdown(WebElement element,int index)
		{
			Select s=new Select(element);
			s.selectByIndex(index);
		}
		/**dropdowns based on visible text
		 * 
		 * @param element
		 * @param text
		 */
		public void dropdown(WebElement element,String text)
		{
			Select s=new Select(element);
			s.selectByVisibleText(text);
		}
		/**
		 * dropdowns based on value
		 * @param value
		 * @param element
		 */
		public void dropdown( String value,WebElement element)
		{
			Select s=new Select(element);
			s.selectByValue(value);
		}
		/**
		 * scrolling action till the element
		 * @param element
		 */
		public void scrollToElement(WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].scrollIntoView(true)",element);
		}
		/**  to take screenshot of web page
		 * 
		 */
		public void takeScreenshot()
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshot/screenshot.png");
			try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/**handling alert popup
		 * 
		 */
		public void handleAlert()
		{
			driver.switchTo().alert().accept();
			
		}
		/**switch the control to child browser
		 * 
		 */
		public void switchToChildBrowser()
		{
			Set<String>set=driver.getWindowHandles();
			for(String windowID:set)
			{
				driver.switchTo().window(windowID);
			}
		}
		/**
		 * switch to frame
		 */
		public void switchToFrame()
		{
			driver.switchTo().frame(0);
			
		}
		/**switching back  from the frame
		 * 
		 */
		public void switchBackFromFrame()
		{
			driver.switchTo().defaultContent();
		}
		/**
		 * closing current tab 
		 */
		public void closeCurrentWindow()
		{
			driver.close();
		}
		/**
		 * quiting browser ie close all tabs and exit webdriver 
		 */
		public void quitBrowser()
		{
			driver.quit();
		}
	
			
	
	}
	
		
		
		
		
		
		
		
		
		
		
		
	
		
	


