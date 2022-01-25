//Q.3)Write a Java program to get the number of elements in a hash set.

import java.util.*;
import java.util.Iterator;
public class Hashset_program3 {

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
  
  System.out.println("Size of the Hash Set: " + h_set.size());
  
	}

}
/*
output:

Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
Size of the Hash Set: 6

 */