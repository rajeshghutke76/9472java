//Q.Write a Java program to iterate through all elements in a array list.

import java.util.ArrayList;
import java.util.List;
public class ArrayExe5 {

	public static void main(String[] args) {
	List<String>list_string=new ArrayList<String>();
	
	list_string.add("1.Red");
	list_string.add("2.Green");
	list_string.add("3.orange");
	list_string.add("4.white");
	list_string.add("5.Black");
	
	for(String element: list_string) {
	
		System.out.println(element);
		
	}
 }

}

/*
 OUTPUT:

1.Red
2.Green
3.orange
4.white
5.Black

 */