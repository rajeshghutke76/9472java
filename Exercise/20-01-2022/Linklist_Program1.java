//Q.1)Write a Java program to insert elements into the linked list at the first and last position.

import java.util.*;

public class Linklist_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList<String> list=new LinkedList<String>();
  
  // use add() method to add values in the linked list
    
  list.add("rajesh");
  list.add("shubham");
  list.add("govind");
  list.add("ajay");
  System.out.println("Original link list:" + list);
  
  System.out.println("Add rahul in  firstly:");
  System.out.println("Add pranay in Lastly:");
  
  list.addFirst("rahul");
  list.addLast("pranay");
  
  System.out.println("Finally linklist is like that:" + list);

  }
}
/*
Output:
Original link list:[rajesh, shubham, govind, ajay]
Add rahul in  firstly:
Add pranay in Lastly:
Finally linklist is like that:[rahul, rajesh, shubham, govind, ajay, pranay]


 */