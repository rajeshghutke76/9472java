import java.util.Scanner;
public class Namesprints1{

public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   
   System.out.print("Input your first name: ");
   String fname = input.next();
   System.out.print("Input your last name: ");
   String lname = input.next();
   System.out.println();
   System.out.println("Hello \n"+fname+" "+lname);
 }

}
/*
Output:
Input your first name:Rajesh
Input your last name:Ghutke

Hello 
Rajesh Ghutke

*/