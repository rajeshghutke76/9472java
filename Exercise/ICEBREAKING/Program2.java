
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Test Data");
        System.out.print("Input number of terms :");
        long num=sc.nextLong();
	System.out.println("Expected Output :");
        long cube=(num*num*num);
        System.out.println("Number is : "+num+"  and cube of "+num+" is "+cube);
    }
         
}

/*
output:

Test Data
Input number of terms :4
Expected Output :
Number is : 4  and cube of 4 is 64


*/