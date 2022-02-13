package javaPractise;

import org.junit.Test;

public class JavaFirstProgram 
{
	public static void main(String[] args)
	{
		System.out.println("Print no from 1 to 100");
		//even();
		//odd();
	}
	@Test
	public static void even()
	{
		System.out.println("Print even numbers");
		for(int i=1;i<=100;i++)
			{
				if(i%2==0)
					{
						
						System.out.println(i);
					}
			}
	}
	
	@Test
	public static void odd()
	{
		System.out.println("Print odd numbers");

		for(int i=1;i<=100;i++)
			{
				if(!(i%2==0))
					{
						
						System.out.println(i);
					}
			}
	}
}
