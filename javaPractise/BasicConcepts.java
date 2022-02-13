package javaPractise;

public class BasicConcepts 
{
	public static void main(String[] args)  //String[] is to pass Command line arguments
	{
		//System.out.println("Welcome to Selenium Java Automation");		
		//addition(65,88);
		//addition();
		//addition(55,"Ram");
		int gSal = employeeGrossSalary(66,88,34); //basic+HRA+specials
		int myNetSal = netSalary(gSal);
		System.out.println("The Net Salary of the Employee :" + myNetSal);
		//return myNetSal;
	}	
	
	public static int employeeGrossSalary(int basic,int hra,int specials) //To find gross salary
	{
		int grossSal = basic+hra+specials;
		return grossSal;
	}
	public static int netSalary(int gross)  //To find Net Salary
	{
		int net = gross + 50000;
		return net;
	}
}