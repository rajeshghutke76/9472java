// Q.4) Write a Java program to test a hash set is empty or not.
import java.util.*;
public class Hashset_program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashSet<String> h_set = new HashSet();
 
	h_set.add("Red");
    h_set.add("Green");
    h_set.add("Black");
    h_set.add("White");
    h_set.add("Pink");
    h_set.add("Yellow");
          
     System.out.println("Original Hash Set: " + h_set);
     System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
     System.out.println("Remove all the elements from a Hash Set: ");
     h_set.removeAll(h_set);
     System.out.println("Hash Set after removing all the elements "+h_set);   
         
	}

}
/* 
OUTPUT:
Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
Checking the above array list is empty or not! false
Remove all the elements from a Hash Set: 
Hash Set after removing all the elements []

 
 */