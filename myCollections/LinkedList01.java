package myCollections;

import java.util.LinkedList;



import org.junit.Test;

public class LinkedList01
{
@Test
public void myLinkedList_Ineger()
{
LinkedList<Integer> numbers= new LinkedList<Integer>();
int len=numbers.size(); //Initial length will be 0;
System.out.println("Length of the array list" +len);
numbers.add(1); //0
numbers.add(12); //1
numbers.add(22); //2
for(int i=0;i<numbers.size();i++)
{
System.out.print(" " +numbers.get(i));
}
int len1= numbers.size();
System.out.println();
System.out.println("Array Size after adding some elements" +len1);
numbers.add(2,16); //At position 2 after 12 and before 22 it will add 16 and push 22 to the right
System.out.println("After Adding");
for(int i=0;i<numbers.size();i++)
{
System.out.print(" " +numbers.get(i));
}
numbers.remove(1);
System.out.println();
System.out.println("After removing");
for(int i=0;i<numbers.size();i++)
{
System.out.print(" " +numbers.get(i));
}
}

}
