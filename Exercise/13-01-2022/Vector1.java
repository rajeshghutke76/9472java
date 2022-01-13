import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<Integer>list=new Vector<Integer>();
		
		list.add(12);
		list.add(10);
		list.add(15);
		list.add(25);
		list.add(23);
		
		System.out.println("Number present in Araay:" + list);
		
		Iterator<Integer> iterator=list.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		

	}

}
/*
 Output:
Number present in Araay:[12, 10, 15, 25, 23]
12
10
15
25
23

 */