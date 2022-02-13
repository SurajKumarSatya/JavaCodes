package inheritanceByObject;

import org.junit.Test;
             //child          //parent
public class TestCase extends Components  //Inheritance concept
{
	@Test
	public void animal()
	{
		System.out.println("Test case: This is a dog ");
		run();
		bark();
		eat();
		sleep();
		play();
	}
	
	@Test
	public void bird ()
	{
		System.out.println("Test case: This is a bird ");
		fly();
		chirp();
		hunt();
		sleep();
	}
}
