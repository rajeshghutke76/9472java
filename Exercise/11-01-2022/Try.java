

public class Try {

	public static void main(String[] args) {
		
		try {
			int a [] =new int[2];
			System.out.println("Element three:" + a[3]);
			
		}catch(Exception e) {
		
			System.out.println("Exception throw:" + e );
		}
		System.out.println("out of the block");
	
	}

}
/*
OUTPUT:
Exception throw:java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
out of the block

*/