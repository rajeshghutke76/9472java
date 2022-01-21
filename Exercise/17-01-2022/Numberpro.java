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

}
