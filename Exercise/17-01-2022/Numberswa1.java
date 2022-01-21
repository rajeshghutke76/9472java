import java.util.*;
public class Numberswa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the two numbers:");
System.out.println();
x=obj.nextInt();
y=obj.nextInt();
System.out.println("Before swapping:"+x+" "+y);
System.out.println();

int t=x;
x=y;
y=t;
System.out.println("After swapping:"+x+" "+y);
System.out.println();
	}

}
