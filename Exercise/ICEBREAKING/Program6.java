
	import java.util.Scanner;

	public class Program6{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Test Data");
	System.out.print("Input number: ");
	int i=sc.nextInt();
	System.out.println("Expected Output :");
	if(i<0){
	System.out.println("Number is negative");}
	else if(i>0){
	System.out.println("Number is possitive");}
	else{
	System.out.println("no is zero");
	}
	}
	}

/*
	output:
	
Test Data

Input number: 35
Expected Output :
Number is possitive

	*/