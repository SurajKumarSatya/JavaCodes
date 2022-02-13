package seleniumAutomation;

import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class AppleVacationsAutomation //extends ApplicationUtilities
{
	public WebDriver driver;//null
	String name = "Ram"; //null
	Actions actions;
	JavascriptExecutor js;
	ApplicationUtilities appUtils;
	public AppleVacationsAutomation()
	{
	  System.out.println("My name :" + name);
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe"); 
	  driver = new ChromeDriver(); // a new empty chrome browser will be opened
	  appUtils = new ApplicationUtilities(driver);
	  actions = new Actions(driver);
	  js = (JavascriptExecutor)driver ; 
	  driver.manage().window().maximize();
	}
	String expected = "AppleVacations.com | Caribbean, Mexico and Hawaii Vacation Packages - All Inclusive Resorts";
	@Before
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");
		driver.get("https://www.applevacations.com/#");
		System.out.println("Expected Title : " + expected);
		System.out.println("Actaul Title : " + driver.getTitle());
		Assert.assertEquals(expected, driver.getTitle());
	}
	@Test
	public void planMyVacation()
	{
		appUtils.getElement("//ng-bind[text()='More Options']","More Options").click();
		WebElement rooms = appUtils.getElement("//select[contains(@name,'numrooms')]");
		Select mySelect = new Select(rooms);
		//mySelect.selectByIndex(2);
		mySelect.selectByVisibleText("4");
		//actions.moveToElement(null)
		
		new Select(rooms).selectByIndex(2);
		
		
		
	}
	
	
}
