import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayExe3 {

	public static void main(String[] args) {
	
    List<String> List1 = new ArrayList<String>();
    List1.add("1");
    List1.add("2");
    List1.add("3");
    List1.add("4");
    
    System.out.println("List1:" + List1);
    
	
   List<String> List2 = new ArrayList<String>();
   List2.add("A");
   List2.add("B");
   List2.add("C");
   List2.add("D");
    
    System.out.println("List2:" + List2);
    
    
    List<String> List3 = new ArrayList<String>();
    List3.add("RAJESH");
    List3.add("BHUSHAN");
    List3.add("SHUBHAM");
    List3.add("GOVIND");
    System.out.println("List3:" + List3);
    
    Collections.copy(List1,List2 /*List3*/);
    
    System.out.println("Copy List to List2 and List3,\nAfter copy:");
    
    System.out.println("List1: " +  List1);
    System.out.println("List2: " +  List2);
    System.out.println("List3: " +  List3);
    
	}

}

/*
OUTPUT:
List1:[1, 2, 3, 4]
List2:[A, B, C, D]
List3:[RAJESH, BHUSHAN, SHUBHAM, GOVIND]

Copy List to List2 and List3,
After copy:

List1: [A, B, C, D]
List2: [A, B, C, D]
List3: [RAJESH, BHUSHAN, SHUBHAM, GOVIND]

 
 */
 
