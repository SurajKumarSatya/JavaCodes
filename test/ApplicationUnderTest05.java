package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ApplicationUnderTest05 
{
	public WebDriver driver;
	
	public ApplicationUnderTest05() 
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
	public void webTable() //throws InterruptedException
	{
		
        WebElement myCalander = driver.findElement(By.xpath("//table[@class='table table-bordered table-dark']"));
        List<WebElement> myRows = myCalander.findElements(By.tagName("tr"));
        int rowCount = myRows.size();
        System.out.println("My Row Count :" + rowCount);
        WebElement secondRow = myRows.get(0);
        List<WebElement> myColumns = secondRow.findElements(By.tagName("th"));
        System.out.println("My Column Count :" + myColumns.size());
        String val22 = myRows.get(2).findElements(By.tagName("td")).get(2).getText();
        System.out.println("App name at 2,2 position is :" + val22);
        String val32 = myRows.get(3).findElements(By.tagName("td")).get(2).getText();
        Assert.assertEquals(val32, "Ventosanzap");

	}
	
}