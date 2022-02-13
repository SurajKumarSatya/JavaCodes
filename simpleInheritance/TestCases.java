package simpleInheritance;

import org.junit.Test;

              //child             //parent
public class TestCases extends ReusableComponents //Implying Inheritance concept using extends keywords
{

	@Test
	public void composeAndSendAnEmail()
	{
		System.out.println("Test Case : composeAndSendAnEmail");
		launchApplication();    //method from parent class
		loginToApplication();   //method from parent class
		compose();              //method from parent class
		send();                 //method from parent class
		logoutFromApplication();//method from parent class
		closeApplication();     //method from parent class
	}
	
	@Test
	public void replyToAnEmail()
	{
		System.out.println("Test Case : replyToAnEmail");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	
	@Test
	public void forwardAnEmail()
	{
		System.out.println("Test Case : forwardAnEmail");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	
	@Test
	public void deleteAnEmail()
	{
		System.out.println("Test Case : deleteAnEmail");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
}
