package myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class collections
{
@Test
public void arrayList_Ineger()
{
List<Integer> numbers= new ArrayList<Integer>();//List-Interface
int len=numbers.size(); //Initial length will be 0;
System.out.println("Length of the array list" +len);
numbers.add(1); //0th position
numbers.add(12); //1st position
numbers.add(22); //2nd position
for(int i=0;i<numbers.size();i++)
{
System.out.print(" " +numbers.get(i));
}
int len1= numbers.size(); //to get the length 
System.out.println();
System.out.println("Array Size after adding some elements" +len1);
numbers.add(2,16); //At position 2 after 12 and before 22 it will add 16 and push 22 to the right
System.out.println("After Adding");
for(int i=0;i<numbers.size();i++)
{
System.out.print(" " +numbers.get(i));
}
numbers.remove(1);  //delete at 1st position
System.out.println();
System.out.println("After removing");
for(int i=0;i<numbers.size();i++)
{
System.out.print(" " +numbers.get(i));
}
Collections.sort(numbers);
}
}
