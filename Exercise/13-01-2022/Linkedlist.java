import java .util.*;

public class Linkedlist {

public static void main(String[] args) {
	
LinkedList<String> list=new LinkedList<String>();

 list.add("Red");
 list.add("Green");
 list.add("Orange");
 list.add("Blue");
 list.add("Pink");
		 
 System.out.println("The colours present in array are:" + list);
 
 Iterator<String>itrIterable=list.iterator();
 
 while(itrIterable.hasNext()) {
	 
	 System.out.println(itrIterable.next());
	 
 }
 
}
}
/*
Output:
The colours present in array are:[Red, Green, Orange, Blue, Pink]
Red
Green
Orange
Blue
Pink

 */