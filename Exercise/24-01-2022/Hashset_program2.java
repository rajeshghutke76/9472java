//Q.2) Write a Java program to iterate through all elements in a hash list.

import java.util.*;
import java.util.Iterator;
public class Hashset_program2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> h_set = new HashSet<String>();
		 
 h_set.add("Red");
 h_set.add("Green");
 h_set.add("Black");
 h_set.add("White");
 h_set.add("Pink");
 h_set.add("Yellow");
		
		
 Iterator<String> I = h_set.iterator();
 
 while (I.hasNext()) {
	   System.out.println(I.next());
	}

 }
}

/*
OUTPUT:
Red
White
Pink
Yellow
Black
Green

 */