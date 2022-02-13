package myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.Test;

public class MyLists
{
	//primitive data types and their wrapper classes :
	// int - Integer , char - Character 
	//We will go to array list if we do some add and read operations .
	//If we need more data manipulations to do like insert ,remove,add operations then LinkedList is the best collection.
	@Test
	public void arrayList_Integer()
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int len = numbers.size(); // intial length will be 0
		System.out.println("Length of the array :" + len );
		numbers.add(1); //0
		numbers.add(12); //1
		numbers.add(262); //2
		numbers.add(17); //0
		numbers.add(162); //1
		numbers.add(22); //2
		numbers.add(111); //0
		numbers.add(912); //1
		numbers.add(122); //2
		System.out.println("Length of the array after :" + numbers.size() );
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}
		numbers.add(2, 16); //to add at 2nd position
		System.out.println("after insertion , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		System.out.println();
		numbers.remove(1); //to remove at 1st position
		System.out.println("after removing , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		Collections.sort(numbers); //tom sort in ascending order
		System.out.println();
		System.out.println("after sorting , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		Collections.reverse(numbers); //to sort in reverse order
		System.out.println();
		System.out.println("after sorting in reverse , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
	}

	
	@Test
	public void myLinkedList_Integer()
	{
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		int len = numbers.size(); // intial length will be 0
		System.out.println("Length of the array :" + len );
		numbers.add(1); //0
		numbers.add(12); //1
		numbers.add(262); //2
		numbers.add(17); //0
		numbers.add(162); //1
		numbers.add(22); //2
		numbers.add(111); //0
		numbers.add(912); //1
		numbers.add(122); //2
		System.out.println("Length of the array after :" + numbers.size() );
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}
		numbers.add(2, 16);
		System.out.println("after insertion , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		System.out.println();
		numbers.remove(1);
		System.out.println("after removing , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		Collections.sort(numbers);
		System.out.println();
		System.out.println("after sorting , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		Collections.reverse(numbers);
		System.out.println();
		System.out.println("after sorting in reverse , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
	}
	//Assignment : 
	//Write program to reproduce the arraylist with different data types like String , Character, Boolean
	//Write a program to sort the array / collection elements in ascending / descending order 
	//Write some programs where you can use nested for loop. There is building Five floors are there each floor contains 30 steps . 
		// Apply different color in each floor 
	
	
	
	//-----------array list with different data types like String -------------
	
	@Test
	public void stringList()
	{
		ArrayList<String> names = new ArrayList<String>();
		int len=names.size();
		System.out.println("Length od array is " + len);
		names.add("Suraj");
		names.add("Vipul");
		names.add("Sudheer");
		names.add("Kanwaljeet");
		names.add("Apoorva");
		names.add("Aman");
		System.out.println("Length of the array after :" + names.size() );
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		names.add("Ravi");
		System.out.println("after insertion , size :" + names.size());
		for(int i=0;i<names.size();i++)
		{
			System.out.println( names.get(i));
		}
	}
	
	
	
                                 //	Color The Floors
	
	@Test 						// ERROR
	public void colorFloor()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=30;j++)
			{
				System.out.println(" Step no " + j);
			}
			System.out.println("Floor no " + i);
		}
	}
	
	
	
	
	
	     //-----------------------Sorting------------------------
	
	
	

	    @Test   
	    public  void myLinkedList_Sort()
	    {
	        LinkedList<Integer> numbers= new LinkedList<Integer>();
	        int temp = 0;
	        numbers.add(45); //0
	        numbers.add(85); //1
	        numbers.add(9); //2
	        numbers.add(785); //0
	        numbers.add(92); //1
	        numbers.add(40); //2
	        numbers.add(1); //0
	        numbers.add(23); //1
	        numbers.add(605); //2
	       System.out.println("####################### List elements before sorting ####################" );
	        for(int i=0; i<numbers.size(); i++)
	        {
	            System.out.print(" " +numbers.get(i));
	        }
	        
	        
	        for(int i=0; i<numbers.size(); i++)
	        {
	            for(int j=1; j<numbers.size(); j++)
	            {
	                if(numbers.get(j-1) > numbers.get(j))
	                {
	                    temp = numbers.get(j-1);
	                    int num = numbers.get(j);
	                    numbers.set(j-1, num);
	                    numbers.set(j, temp);
	                }
	            }
	            
	        }
	        System.out.println();
	        System.out.println("####################### List elements after sorting ####################" );
	        for(int i=0; i<numbers.size(); i++)
	        {
	            System.out.print(" " +numbers.get(i));
	        }
	    
	    }
	}
	
	

