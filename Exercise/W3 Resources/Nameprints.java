 import java.util.Scanner;
public class Nameprints {

	public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      System.out.println("Input  the first name:");
      String fname=input.next();
	  System.out.println("Input  the midle name:");
	  String mname=input.next();
      System.out.println("Input  the last name:");
	  String lname=input.next();
	  System.out.println("Hello \n"+ fname +" "+ mname +" "+ lname);
		 
	}

}
/*
Output:
Input  the first name:
Rajesh

Input  the midle name:
Bhimrao

Input  the last name:
Ghutke

Hello 
Rajesh Bhimrao Ghutke

*/
