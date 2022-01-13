import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayExe4 {

	public static void main(String[] args) {
		
System.out.println("FIRST OUTPUT IS THAT:");		
		
	List<String>list_string=new ArrayList<String>();
	 list_string.add("RED");
	 list_string.add("ORANGE");
	 list_string.add("GREEN");
	 list_string.add("WHITE");
	 list_string.add("BLACK");
	
	System.out.println("List before sort:"+ list_string);
	Collections.sort(list_string);
	System.out.printf("List after sort:"+ list_string);
	
System.out.println("SECOND OUTPUT IS THAT:");
	
	  List<String>liststring=new ArrayList<String>();
	    liststring.add("RAJESH");
	    liststring.add("SHUBHAM");
	    liststring.add("AJAY");
	    liststring.add("GOVIND");
	    liststring.add("BHUSHAN");
	    
	System.out.println("List before sort:"+ liststring);
	Collections.sort(liststring);
	System.out.println("List after sort:"+ liststring);
	
	
	}

}
/*
OUTPUT:
FIRST OUTPUT IS THAT:
List before sort:[RED, ORANGE, GREEN, WHITE, BLACK]
List after sort:[BLACK, GREEN, ORANGE, RED, WHITE]

SECOND OUTPUT IS THAT:
List before sort:[RAJESH, SHUBHAM, AJAY, GOVIND, BHUSHAN]
List after sort:[AJAY, BHUSHAN, GOVIND, RAJESH, SHUBHAM]


*/