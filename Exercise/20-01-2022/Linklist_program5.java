//Q.5)Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.*;

public class Linklist_program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list=new LinkedList<>();
		
		 list.add("Rajesh");
		 list.add("Shubham");
		 list.add("Govind");
		 list.add("Ajay");
		 
		 System.out.println(" ORIGINALLY LINKED LIST:-");
		 System.out.println(" Let add the Rahul name after the Rajesh name:" + list);
		 
		 list.add(1,"Rahul");
		 
		 System.out.println(" FINNALLY LINKED LIST:-" + list);

	}

}
/*
OUTPUT:

 ORIGINALLY LINKED LIST:-
 Let add the Rahul name after the Rajesh name:[Rajesh, Shubham, Govind, Ajay]
 FINNALLY LINKED LIST:-[Rajesh, Rahul, Shubham, Govind, Ajay]

 */