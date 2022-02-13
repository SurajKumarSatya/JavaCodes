package seleniumAutomation;

import org.junit.Before;

//import java.util.List;

//import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import junit.framework.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import junit.framework.Assert;

public class GmailAutomation 
{
	
	
	
	public WebDriver driver;
	String expectedTitle="Gmail";   //instance variable
	
	
	
	public GmailAutomation()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		//driver.get("https://gmail.com");
	}
	
	
	
	@Before
	public void launchApplication() throws InterruptedException
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe" );
		//WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		String actualTitle=driver.getTitle();
		System.out.println("My title " + actualTitle );
		System.out.println("My Url " + driver.getCurrentUrl()); //to get current title
		System.out.println("My Session Id " + driver.getWindowHandle());
		if(expectedTitle.equals(actualTitle))  //comparing actual and expected title
		{
			System.out.println("Title Validation Passed");
		}
		else
		{
			System.out.println("Title Validation Failed");
		}
		Assert.assertEquals(expectedTitle, actualTitle);
		WebElement emailObj = driver.findElement(By.name("identifier"));
		if(emailObj.isDisplayed() && emailObj.isEnabled())
		{
			emailObj.click();                 //to click
			emailObj.sendKeys("gfggfdgfg");   //to give some value
			Thread.sleep(2000);               //to wait
			emailObj.clear();                 //to clear
			Thread.sleep(2000);
			emailObj.sendKeys("nag022@gmail.com");
		}
		else
		{
			System.out.println("Email or phone number object is not displayed / not enabled");
		}
		
		driver.findElement(By.name("identifier")).sendKeys("nag022");
		
	}
	
	
	
	
	
	
	@Test
	public void loginToApplication() throws InterruptedException
	{
		//launchApplication();
		System.out.println("Test Case : Login To Application");
		//System.setProperty("webdriver.chrome.driver","C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe" );
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("sks@gmail.com");
		//driver.findElement(By.id("identifierId")).sendKeys("sks@gmail.com");
		driver.findElement(By.xpath("//input[@name='identifier']")).click();
	}
	
	@Test
	public void forgotEmail() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe" );
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://gmail.com");
		//driver.findElement(By.tagName("button")).click();
		//button[@jsname='Cuz2Ue']
		driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
		
	}
	
	@Test
	public void learnMore() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe" );
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://gmail.com");
		//driver.findElement(By.tagName("a")).click();
		driver.findElement(By.xpath("//a[@jsname='JFyozc']")).click();
		
	}
	
	@Test
	public void createAccount() throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver","C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe" );
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://gmail.com");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
	}	
	
    @Test
    public void help() throws InterruptedException
    {
//    	System.setProperty("webdriver.chrome.driver","C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe" );
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://gmail.com");
		//driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.xpath("//a[text()='Help']")).click();
    }
    
    @Test
    public void privacy() throws InterruptedException
    {
//    	System.setProperty("webdriver.chrome.driver","C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe" );
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://gmail.com");
		//driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
    }
    
    @Test
    public void terms() throws InterruptedException
    {
//    	System.setProperty("webdriver.chrome.driver","C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe" );
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://gmail.com");
		//driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.xpath("//a[text()='Terms']")).click();
    }
}
