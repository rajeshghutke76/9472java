

	import java.util.Scanner;
	public class Program4 {
	public static void main(String[] arg){
	Scanner sc=new Scanner(System.in);
	System.out.println("Test Data: ");
	System.out.print("Input first number: ");
	int inputFirst=sc.nextInt();
	System.out.print("Input second number: ");
	int inputSecond=sc.nextInt();
	System.out.println("Expected output: ");
	int add=inputFirst+inputSecond;
	System.out.println(inputFirst+"+"+inputSecond+"="+add);
	int sub=inputFirst-inputSecond;
	System.out.println(inputFirst+"-"+inputSecond+"="+sub);
	int mul=inputFirst*inputSecond;
	System.out.println(inputFirst+"*"+inputSecond+"="+mul);
	int div=inputFirst/inputSecond;
	System.out.println(inputFirst+"/"+inputSecond+"="+div);
	int per=inputFirst%inputSecond;
	System.out.println(inputFirst+" mod "+inputSecond+"="+per); }
	}


/*
  output:
  Test Data: 
Input first number: 125
Input second number: 24
Expected output: 
125+24=149
125-24=101
125*24=3000
125/24=5
125 mod 24=5

 
 */