
	import java.util.Scanner;
	public class Program7{
	public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Test Data");
	System.out.print("Input the 1st number:");
	int a=sc.nextInt();
	System.out.print("Input the 2nd number:");
	int b=sc.nextInt();
	System.out.print("Input the 3rd number:");
	int c=sc.nextInt();
	System.out.println("Expected Output :");
	if(a>b&&a>c){
	System.out.println("The Greatest: " +a);}
	else if(b>a&&b>c){
	System.out.println("The Greatest: " +b);}
	else if(c>a&&c>b){
	System.out.println("The Greatest: " +c);
	}
	else {
	System.out.println("no. are equal ");}
	}
	}
/*
output:

Test Data
Input the 1st number:25
Input the 2nd number:78
Input the 3rd number:87
Expected Output :
The Greatest: 87

	*/