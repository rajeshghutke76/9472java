
	import java.util.Scanner;
    public class Program5{
	public static void main(String[] arg){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input a number: ");
	int userInput=sc.nextInt();
	System.out.println("Expexted Output:");
	for(int i=1;i<=10;i++){
	int table=userInput*i;
	System.out.println(userInput+"*"+i+"="+table);}
	}}

/*
    output:
    Input a number: 8
Expexted Output:
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