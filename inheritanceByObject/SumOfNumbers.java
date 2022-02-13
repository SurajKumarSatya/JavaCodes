package inheritanceByObject;

import org.junit.Test;

public class SumOfNumbers 
{
	///--------Sum of Arrays-----///
	
	@Test
	public void sum()
	{
		int[] num1 = {87,98,31,54,78};  //array 1
		int[] num2=  {45,68,86,29,75};  //array 2
		int len = num1.length;
		System.out.println("Length of numbers is "+len);
				
		for(int i=0;i<len;i++)
		{
			int sum=num1[i]+num2[i];  //sum of arrays
			System.out.println("The sum of " + num1[i] + " and " + num2[i] + " is " + sum);
			
		}
		
	}
	
	
	///---------Series Print-------//////
	
	public void seriesNum(int starting, int commondiff, int end)
	{
		//given starting point and end point and difference between the integers and then print series
		for(int i=starting; i<=end; i=i+commondiff) 
		{
			System.out.println(i);
		}
	}
	
	
	
	@Test
	public void seriesNum_Test()
	{
	    seriesNum(3,3,30);
		
	}
	
	
	
	
	
	
	
	
	
}


