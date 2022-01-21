import java.util.*;

public class Numberpro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int x=0, y=0, z=0;
 
Scanner obj= new Scanner(System.in);

System.out.println();

x=obj.nextInt();
y=obj.nextInt();
z=obj.nextInt();

int sum=x+y+z;
int div=x/y/z;
int mul=x*y*z;
int avg=(x+y+z)/3;

System.out.println("sum of three numbers:"+sum);
System.out.println("division of three numbers:"+div);
System.out.println("product of three numbers:"+mul);
System.out.println("average of three numbers:"+avg);

if(x>=y&&x>=z) {
	System.out.println("max number is:"+x);
}else if(y>=x&&y>=z) {
	System.out.println("max number is:"+y);
}else if(z>=x&&z>=y) {
	System.out.println("max number is:"+z);
}
if(x<=y&&x<=z) {
	System.out.println("min number is:"+x);
}else if(y<=x&&y<=z) {
	System.out.println("min number is:"+y);
}else if(z<=x&&z<=y) {
	System.out.println("min number is:"+z);
}
}
}

/*
Output:

2
4
6
sum of three numbers:12
divistion of three numbers:0
product of three numbers:48
average of three numbers:4
max number is:6
min number is:2

 */
