class Student
{
public int roll_no;
public String name;
Student(int roll_no, String name)
{
this.roll_no = roll_no;
this.name = name;
}
}
public class ExampleArray3 {

  public static void main(String[] args) {
	  Student[] arr;

	  arr = new Student[5];

	  arr[0] = new Student(1,"rajesh");
	  arr[1] = new Student(2,"amit");
	  arr[2] = new Student(3,"waman");
	  arr[3] = new Student(4,"shubham");
	  arr[4] = new Student(5,"rajnish");
	  for (int i = 0; i < arr.length; i++)
	  System.out.println("Element at " + i + " : " +
	  arr[i].roll_no +" "+ arr[i].name);
	  }
   }  
/* 
Output:
Element at 0 : 1 rajesh
Element at 1 : 2 amit
Element at 2 : 3 waman
Element at 3 : 4 shubham
Element at 4 : 5 rajnish

 */
