//Q.4)Write a Java program to insert some elements at the specified position into a linked list.
import java .util.*;

public class Linklist_program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedList<String> list=new LinkedList<String>();
	
	list.add("MOBILE");
	list.add("WATCH");
	list.add("LAPTOP");
	list.add("HEADPHONE");
	list.add("ADAPTER");
 
	System.out.println(" ORGINALLY LINKLIST:- " + list);	
	
	LinkedList<String> list_1=new LinkedList<String>();
	
	list_1.add("apple");
	list_1.add("orange");
	list_1.add("graphes");
	list_1.add("Banana");
	
	list.addAll(2,list_1);
	
	System.out.println(" AFTER EXECUTED LINKLIST:- " + list);	


	}

}
/* 
OUTPUT:

ORGINALLY LINKLIST:- [MOBILE, WATCH, LAPTOP, HEADPHONE, ADAPTER]

AFTER EXECUTED LINKLIST:- [MOBILE, WATCH, apple, orange, graphes, Banana, LAPTOP, HEADPHONE, ADAPTER]


 */
