import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionExe1 {

	public static void main(String[] args) {
		
  List<String> list=new ArrayList<String>();
  
   list.add("Rajesh");
   list.add("shubham");   
   list.add("Govind");
   list.add("Ajay");
   list.add("Bhushan");
   list.add("Pandurang");

   Iterator<String> itr=list.iterator();
   
while (itr.hasNext()) {
	   System.out.println(itr.next());
      }
   
	}

}
/*
OUTPUT:

 */





/*import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

  public class CollectionExe1{
	  public static void main(String[] args) {
		  
		 List<String> list=new ArrayList<String>();
		 list.add("Rajesh");
		 list.add("Ghutke");
		 
		Iterator<String> itr=list. iterator();
		
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		  
	  }
	
}*/

/*import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class CollectionExe1{
	
	public static void main(String[] args) {
		
		List<String>list= new ArrayList<String>();
		list.add("raj");
		list.add("manoj");
		
		Iterator itr=list.iterator();
		
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
  }
}

*/

/*import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionExe1{
	
	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		
		list.add("Rajesh");
		list.add("Shubham");
		list.add("Govind");
		
		Iterator<String> itr=list.iterator();
		
		
		while(itr.hasNext());
		System.out.println(itr.next());
		
	}
}

*/
































