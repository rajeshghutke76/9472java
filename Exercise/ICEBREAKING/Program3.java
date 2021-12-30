

	import java.util.Scanner;
	public class Program3 {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Test Data");
	        int num1;
	        int num2;
	        System.out.print("Input First number :");
	        num1=sc.nextInt();
	        System.out.print("Input Second number :");
	        num2=sc.nextInt();

	        int product=num1*num2;
		System.out.println("Expected Output :");
	        System.out.println(num1+"*"+num2+"="+product);
	        
	    }
	}

/*
  output:
  
Test Data

Input First number :25
Input Second number :5
Expected Output :
25*5=125

*/

