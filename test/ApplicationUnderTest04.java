package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ApplicationUnderTest04 
{
	public WebDriver driver;
	
	public ApplicationUnderTest04() 
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
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='test5-button']")).click();
		{
		WebElement message = driver.findElement(By.xpath("//div[@id='test-5-div']//div[@class='alert alert-success']"));
		Assert.assertEquals(true, message.isDisplayed());
		System.out.println("Message is displayed");
		WebElement testButton05 = driver.findElement(By.xpath("//div[@id='test-5-div']//button[@id='test5-button']"));
		//Assert.assertEquals(true, testButton05.isEnabled());
		if(testButton05.isEnabled())
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is Disabled");
		}
		
		}
		
		
	
	}
	
	
	
	
	
	
}	
	