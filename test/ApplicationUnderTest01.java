package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ApplicationUnderTest01 
{
	public WebDriver driver;
	
	public ApplicationUnderTest01() 
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
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("sks@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("sks@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
	   
	}
	
	
	
	@Test
	public void signUpButton()
	{
		 WebElement button = driver.findElement(By.xpath("//button[text()='Sign in']"));
		 Assert.assertEquals(true, button.isDisplayed());
		 System.out.println("Sign up button is enabled");
	}
	
	@Test
	public void username()
	{
		 WebElement username = driver.findElement(By.xpath("//input[@id='inputEmail']"));
		 Assert.assertEquals(true, username.isEnabled());
		 System.out.println("Username text is enabled");
	}
	
	@Test
	public void password()
	{
		 WebElement password = driver.findElement(By.xpath("//input[@id='inputPassword']"));
		 Assert.assertEquals(true, password.isEnabled());
		 System.out.println("Password text is enabled");
	}
	
	
	
	
	

}
