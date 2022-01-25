//Q.2)Write a Java program to insert the specified element at the front of a linked list.

import java.util.*;

public class Linklist_program2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("apple");
		list.add("orange");
		list.add("graphes");
		list.add("Banana");
	
		
		System.out.println(" Originally linklist:" + list);		
		
		 list.offerFirst("cherry");
		 
		 System.out.println(" After present in front :");
		 
		 System.out.println(" Finally linklist:" + list);		
	}

}
/*
 * 
OUTPUT:

 Originally linklist:[apple, orange, graphes, Banana]
 
 After present in front :
 
 Finally linklist:[cherry, apple, orange, graphes, Banana]
 

*/
