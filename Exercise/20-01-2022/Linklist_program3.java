//Q.3)Write a Java program to insert the specified element at the end of a linked list.

import java.util.*;

public class Linklist_program3 {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String> list=new LinkedList<String>();
		
		list.add("MOBILE");
		list.add("WATCH");
		list.add("LAPTOP");
		list.add("HEADPHONE");
		list.add("ADAPTER");
	
		
		System.out.println(" Originally linklist:" + list);		
		
		 list.offerLast("CHARGER");
		 
		 System.out.println(" Present in End :");
		 
		 System.out.println(" Finally linklist:" + list);		
	}

}	

/*
Output:

Originally linklist:[MOBILE, WATCH, LAPTOP, HEADPHONE, ADAPTER]
Present in End :
Finally linklist:[MOBILE, WATCH, LAPTOP, HEADPHONE, ADAPTER, CHARGER]


*/