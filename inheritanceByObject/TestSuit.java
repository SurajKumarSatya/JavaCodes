package inheritanceByObject;

import org.junit.Test;
  
// Applying "Multilevel Inheritance" where "TestSuit" is inheriting from "TestCase" and "TestCase"
                                                                //is inheriting from "Component"
             //child          //parent
public class TestSuit extends TestCase
{
	@Test
	public void flaura()
	{
		animal();
		System.out.println("All animals  are flaura ");
	}
	
	@Test
	public void fauna()
	{
		bird();
		System.out.println("All birds  are fauna ");
	}

}
