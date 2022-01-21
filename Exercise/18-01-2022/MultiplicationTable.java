import java.util.*;
public class MultiplicationTable {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
  int x;
  System.out.println("Enter the number of table:");
  
  Scanner obj= new Scanner(System.in);
  
  x=obj.nextInt();
  
  for(int i=0;i<11;i++) {
	  int y=x*i;
	  System.out.println(+x+"*"+i+"="+y);
  }
	}

}
/*
Output:
Enter the number of table:
8

8*0=0
8*1=8
8*2=16
8*3=24
8*4=32
8*5=40
8*6=48
8*7=56
8*8=64
8*9=72
8*10=80
*/