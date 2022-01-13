import java.util.ArrayList;
import java.util.List;

public class ArrayExe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    List<String>list_string=new ArrayList<String>();
    
      list_string.add("Red");
      list_string.add("Green");
      list_string.add("Orange");
      list_string.add("WHITE");
      list_string.add("Black");
      
      System.out.println(list_string);
      
      list_string.set(2, "Yellow");
      
      System.out.println(list_string);
      
	}

}
/*
Output:

[Red, Green, Orange, WHITE, Black]
[Red, Green, Yellow, WHITE, Black]



*/