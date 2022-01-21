import java.util.Scanner;

public class Numberpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner obj=new Scanner(System.in);
  
  float a,b ;
  a=obj.nextFloat();
  b=obj.nextFloat();
  
  System.out.println("Addition of a and b :"+a+b);
  System.out.println("Multiplication of a and b:"+a*b);
  System.out.println("Division of a and b :"+a/b);
  System.out.println("Average of a and b:"+(a+b)/2);
  
  if(a>b) {
	  System.out.println("maximum number is:"+a);
  }
  if (b>a) {
	  System.out.println("maximum mo is:"+b);
  }
  if (a<b) {
	  System.out.println("minimum no is:"+a);
  }
  if(b<a) {
	  System.out.println("minimum mo is :"+b);
	  
  }
  else {
	  System.out.println("The maximum and minimum no is:"+(a));
  }
	}
	

/*
output:
12
10
Addition of a and b :12.010.0
Multiplication of a and b:120.0
Division of a and b :1.2
Average of a and b:11.0
maximum number is:12.0
minimum no is :10.0

 */ 
