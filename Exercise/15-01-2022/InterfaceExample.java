//Write  the object Girl and the value of int c=9. Show the resulting outputs.



interface in1
{
final int c=9;

void display();
}

public class InterfaceExample implements in1{

public void display()
{
System.out.println("Girl");
}
public static void main(String args[]){
InterfaceExample g=new InterfaceExample();
g.display();
System.out.println(c);
}
}
/*
Output:

Girl
9

 */