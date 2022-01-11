import java.util.Scanner;

public class Addition1 {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Input the first number:");
		int num1=input.nextInt();
		System.out.println("Input the second number:");
		int num2=input.nextInt();
		int sum= num1+num2;
		
		System.out.println("Sum:"+sum);
	}

}
