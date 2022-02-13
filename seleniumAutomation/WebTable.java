package seleniumAutomation;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

				//-----------Assignment------------------
               //https://www.w3schools.com/html/html_tables.asp

//Write a common method to read data from table , function should read row,col numbers as inputs - getCellData(row,col)

//What is the Country name of Island Trading
	
//Tell me the company in Canada 
	
//Who is the Contact person for Laughing Bacchus Winecellars
	
//Giovanni Rovelli  is the point of contct for which company


public class WebTable 
{
	public WebDriver driver;
	
	public WebTable()
	{
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Software(Suraj)\\chromedriver_win32\\chromedriver.exe"); 
	  driver = new ChromeDriver(); // a new empty chrome browser will be opened
	 // actions = new Actions(driver);
	  //driver.manage().window().maximize();
	}	
	
	
	@Before
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	}
	
	@Test    
	public void webTable() //throws InterruptedException
	{
		
        WebElement myCalander = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']"));
        List<WebElement> myRows = myCalander.findElements(By.tagName("tr"));
        int rowCount = myRows.size();
        System.out.println("My Row Count :" + rowCount);
        WebElement secondRow = myRows.get(0);
        List<WebElement> myColumns = secondRow.findElements(By.tagName("th"));
        System.out.println("My Column Count :" + myColumns.size());
        String val42 = myRows.get(4).findElements(By.tagName("td")).get(2).getText();
        System.out.println("Country name of Island Trading is :" + val42);
        String val50 = myRows.get(5).findElements(By.tagName("td")).get(0).getText();
        System.out.println("Company in Canada is :" + val50);
        String val51 = myRows.get(5).findElements(By.tagName("td")).get(1).getText();
        System.out.println("Contact person for Laughing Bacchus Winecellars is :" + val51);
        String val60 = myRows.get(6).findElements(By.tagName("td")).get(0).getText();
        System.out.println("Giovanni Rovelli  is the point of contct companys is :" + val60);
	}
	
	

}
