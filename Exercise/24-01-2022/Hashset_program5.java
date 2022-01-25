//Q.5)Write a Java program to convert a hash set to a List/ArrayList.

import java.util.*;
public class Hashset_program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashSet<String> h_set = new HashSet<String>();
 h_set.add("Red");
 h_set.add("Green");
 h_set.add("Black");
 h_set.add("White");
 h_set.add("Pink");
 h_set.add("Yellow");
 
 System.out.println("Original Hash Set: " + h_set);
 
 ArrayList<String> list_1 = new ArrayList<String>(h_set);
 
 System.out.println("ArrayList contains: "+ list_1);
 
	}

}
/*
OUTPUT:-

Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
ArrayList contains: [Red, White, Pink, Yellow, Black, Green]

 
 */