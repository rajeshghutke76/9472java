
 public class Try2 {

	public static void main(String[] args) {
		
		int a[] =new int[2];
		
		try {
			System.out.println("Access element three is: "+ a[3]);
		} catch (Exception e) {
				System.out.println("Exception throw:"+ e);

	}finally {
		 a[0]=6;
		 System.out.println("First element is" + a[0]);
		 System.out.println("Finally statment is executed");
        }
	}
 }
/*
 OUTPUT:
 Exception throw:java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
First element is6
Finally statement is executed

 */
 