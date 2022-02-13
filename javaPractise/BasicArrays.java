package javaPractise;

import org.junit.Test;

public class BasicArrays
{
	
	
	//Array : Is a collection of memory locations of similar data type / homogeneous data type
	//Fixed Array: Length of the array is fixed . Elements also will be fixed .
	//Dynamic Array : Length of the array is fixed .Elements can be loaded in to the array at run time .
	//Signature of array
	//How to declare an array , how to assign values in to the array
	//How to know the length of the array
	//How to read the elements from the array 
	//How to write elements in to the array
	//We can not increase / decrease the size of the array .
	//We can not delete any elements in the array
	//Local variables should not have any modifier
	//Arrays will allow duplicate values to enter
	//Signature of Fixed Array
	 //Modifier[opt]   DataType[]   name = { values };
	//Syntax to read the element : value =  name[index] ;
	//Syntax to write the element : name[index] = valuetoload ;
	//In arrays index value always start from 0 
	//Different Exceptions in JAVA : TypeMismatch , ArrayIndexOutOfBoundsException 
	public int rollNum = 22;
	
	@Test
	public void fixedIntegerArray()
	{   //                0	 1  2 3  4  5  6  7  8  9                          18  19
		int[] numbers = {22,24,26,28,29,32,34,35,38,39,43,45,47,48,54,56,58,52,22};
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
	//	int value = numbers[0]; // read the value
		numbers[1] = 55; //write the value
		//for(int i=0;i<=len;i++)
		for(int i=0;i<len;i++) // i = 0 ....18 19
		{
			System.out.println("Elements before :" + numbers[i]); // i =0 1 2 3 4 5
		}		
	}	
	
	//Signature of Dynamic Array
		 //Modifier[opt]   DataType[]   name = new  int[size];
	//What is the default value of integer in java - 0
	@Test
	public void dynamicIntegerArray()
	{   //                0	 1  2 3  4  5  6  7  8  9                          18  19
		//int[] numbers = {22,24,26,28,29,32,34,35,38,39,43,45,47,48,54,56,58,52,22};
		int[] numbers = new int[20];
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		//int value = numbers[0]; // read the value
		//numbers[1] = 55; //write the value
		for(int i=0;i<len;i++) // i = 0 ....18 19
		{
			System.out.println("Elements before :" + numbers[i]); // i =0 1 2 3 4 5
		}	
		for(int i=0;i<len;i++)
		{
			numbers[i] = 22+i;
			System.out.println("Elements after :" + numbers[i]);
		}
	}
	
	//Assignment :
	//Write the above fixed array program with different data types like String , char 
		//Write a program to read the array as input and find each element is even or not .
		//Move all even numbers in to one array
		//Move all odd numbers in to one array
		//Write a program to read the student numbers as an array and find a particular number . Read the number to find as input
		//Write a program to demonstrate index out of bounds exception with a fixed array
	
	//Write the above dynamic array program with different data types like String , char 
	//Write a program to read the marks of the student in a fixed array and calculate percentage of marks for each student then move the percentage in to a dynamic array.
	//Write a program to show the default values of all data types in java
	//Write a program to demonstrate index out of bounds exception with a dynamic array
	
	//----------------------Assignment--------------------------
	
	//-----------------Different Data Types---------------------
	@Test
	public void fixedStringArray()
	{
		String[] name={"ram","Shyam","rahul","ravi"};
		int len=name.length;
		System.out.println("Length of Array :" + len);
		for(int i=0;i<len;i++)
		{
			System.out.println("Names are " + name[i]);
		}
	}
	
	@Test
	public void fixedCharArray()
	{
		char[] characters={'A','B','C','D','E','F'};
		int len=characters.length;
		System.out.println("Length of Array :" + len);
		for(int i=0;i<len;i++)
		{
			System.out.println("Characters are " + characters[i]);
		}
	}
	
	
	//-------------------Even And Odd----------------------
	
	
	@Test
	public void evenOdd()
	{
		int a[]={2,3,6,32,78,45,12,77,90,57,67};
		System.out.println("Odd Numbers");
		for(int i=0;i<=a.length-1;i++)
		//for(int i=0;i<=a.length;i++)	  //ArreyIndexOutOfBoundException
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Even Numbers");
		for(int i=0;i<=a.length-1;i++)
	    //for(int i=0;i<=a.length;i++)	  //ArreyIndexOutOfBoundException
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	
	
	
	
	//------------------Find the position of element-------------------- 
	
	
	public void student(int value)
	{
		int[] marks = {87,98,31,54,78};
		int len = marks.length;
		System.out.println("Length of the array :" + len);
		
		for(int i=0;i<len;)
		{
		    if(value == marks[i])
		    {
		    System.out.println( +value + " is at " + i + " th position");
		    }i++;  	   		       	
		}		
	}
	
	@Test
	public void student_Test()
	{
		student(54);
	}
	
	
	//--------------------Calculate percentage-----------------------
	
	
	@Test
	public void stu_marks()
	{
		int sum=0;
		float per;
		int[] marks ={30,56,87,99,67};
		int len = marks.length;
		System.out.println("Length of the array :" + len);
		
		for(int i=0;i<=len-1;i++)
		{
			 sum=sum+marks[i];
			
		}
		
		System.out.println(sum); 
		
		per=(float)((sum*100)/500);
		System.out.println("Percentage = " + per);
	}
	
	
	//------------------Default Value------------------------------
	
	int i ;
	String s;
	float f;
	double d;
	char c;
	boolean b;
	long l;
	
	
    @Test
	public void value(){
		System.out.println("Default Value of int is " + i);
		System.out.println("Default Value of string is " + s);
		System.out.println("Default Value of float is " + f);
		System.out.println("Default Value of double is " + d);
		System.out.println("Default Value of char is " + c);
		System.out.println("Default Value of boolean is " + b);
		System.out.println("Default Value of long is " + i);
	}
    
    
    //------All even numbers in one array and odd number in other array------
    
    @Test
    public void evensOdds()
    {
    int[] numbers= {22,21,26,28,29,37,34,35,38,39,43,45,47,48,54,56,58,52};
    int len=numbers.length;
    int[] a= new int[len];
    int[] b= new int[len];
    int countEven = 0;
    int countOdd = 0;

    for(int i=0;i<len;i++)
    {       
     for(int j=countEven;j<len;j++)
     {
       if(numbers[i]%2==0)
        {
            a[j]=numbers[i];
            countEven++;
            break;
        }

      }

     for(int j=countOdd;j<len;j++)
     {
       if(numbers[i]%2!=0)
        {

            b[j]=numbers[i];
            countOdd++;
            break;
       }
     }
    }

    System.out.println("All the even numbers in array are:");
    for(int k=0;k<a.length;k++)
    {
    System.out.print(" " +a[k]);
    }
    System.out.println("");
    System.out.println("All the odd numbers in array are:");
    for(int k=0;k<a.length;k++)
    {
    System.out.print(" " +b[k]);
    }
    } 
	
}
