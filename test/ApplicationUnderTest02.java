package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ApplicationUnderTest02 
{
	public WebDriver driver;
	
	public ApplicationUnderTest02() 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
	}
	
	@Before
	public void launchTest()
	{
		driver.get("file:///C:/Users/gurunath/Desktop/index.html");
	}
	
	
	@Test
	public void testHome() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Guide')]")).click();
		
	}
	
		
	

	
	@Test
	public void secondListItem()
	{
		 String secondListItem = driver.findElement(By.xpath("//*[contains(text(),'List Item 2')]")).getText();
		 String expected="List Item 2";
		 Assert.assertEquals(expected, secondListItem);
		 System.out.println("second list item's value is set to List Item 2");
	}
	

	
	@Test
	public void secondListItemBadgeValue()
	{
		 String secondListItemBadgeValue = driver.findElement(By.xpath("//span[@class='badge badge-pill badge-primary'  and text()='6']")).getText();
		 String expected="6";
		 Assert.assertEquals(expected, secondListItemBadgeValue);
		 System.out.println("second list item's badge value value is 6");
	}
	

}
