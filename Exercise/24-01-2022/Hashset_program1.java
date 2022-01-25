//Q.1) Write a Java program to append the specified element to the end of a hash set.

import java.util.*;

public class Hashset_program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet<String> hash_set=new HashSet<String>();
   
   hash_set.add("RAJESH");
   hash_set.add("WAMAN");
   hash_set.add("AMIT");
   hash_set.add("YOGESH");
   hash_set.add("KUNAL");
   hash_set.add("SHUBHAM");
   
   System.out.println("THE HASHSET NAME IS :- " +  hash_set);
   
	}

}
/*
OUTPUT:

THE HASHSET NAME IS :- [YOGESH, KUNAL, WAMAN, AMIT, RAJESH, SHUBHAM]

 */

