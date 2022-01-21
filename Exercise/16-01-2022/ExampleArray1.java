
public class ExampleArray1 {
  static int[] get() {
	  return new int [] {10,20,30,40,50,60};
	  
  }
	public static void main(String[] args) {
		int[]num=get();
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}

	}

}

/*
Output:
10
20
30
40
50
60
*/
