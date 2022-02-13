package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ApplicationUnderTest03 
{
	public WebDriver driver;
	
	public ApplicationUnderTest03() 
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
	public void testButton01()
	{
		 WebElement testButton01 = driver.findElement(By.xpath("//div[@id='test-4-div']//button[@class='btn btn-lg btn-primary']"));
		 Assert.assertEquals(true, testButton01.isEnabled());
		 System.out.println("Button is enabled");
	}
	
	
	@Test
	public void testButton02()
	{
		 WebElement testButton01 = driver.findElement(By.xpath("//div[@id='test-4-div']//button[@class='btn btn-lg btn-secondary']"));
		// Assert.assertEquals(true, testButton01.isEnabled());
		 if(testButton01.isEnabled())
		 {
			 System.out.println("Button is enabled");
		 }
		 else
		 {
			 System.out.println("Button is Disabled");
		 }
		 
	}
	
}