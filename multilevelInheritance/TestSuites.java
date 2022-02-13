package multilevelInheritance;

import org.junit.Test;
//Multilevel inheritance
//            A      extends      B     extends C  :   indirectly A inherits C as well        
//            child             parent1     parent2
public class TestSuites extends TestCases
{   // Multiple inheritance is not possible with extending more than one class at a time . If both parent
	//classes are having same function then we can't specify from which parent to get the function
	
	//----------------- Test Suites ------------------------
	@Test
	public void smokeSuite()
	{
		launchApplication();
		
		 System.out.println("Test Suite : SMOKE"); 
		 composeAndSendAnEmail();
		 forwardAnEmail();
		 
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		forwardAnEmail();
		replyToAnEmail();
		deleteAnEmail();
	}

}