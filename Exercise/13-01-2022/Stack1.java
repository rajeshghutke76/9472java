import java.util.Iterator;
import java.util.Stack;


public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	Stack<String> list= new Stack<String>();
	list.push("Num1");
	list.push("Num2");
	list.push("Num3");
	list.push("Num4");
	
	System.out.println("The string is start From:" + list);
	
	Iterator<String>iterator=list.iterator();
	
	while(iterator.hasNext()) {
		
		System.out.println(iterator.next());
	}
	
	
	}

}
/*
 OUTPUT:
The string is start From:[Num1, Num2, Num3, Num4]
Num1
Num2
Num3
Num4

 */