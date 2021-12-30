
	import java.util.Scanner;
	public class Program8{
	 public static void main( String args[] )    
	    { 
	        Scanner input = new Scanner(System.in);
	        int number1;  
	        int number2;
	        System.out.println( "Input Data: " ); 
	        System.out.print( "Input first integer: " ); 
	        number1 = input.nextInt(); 
	        System.out.print( "Input second integer: " ); 
	        number2 = input.nextInt();
	 if ( number1 == number2 )           
	            System.out.printf( "%d == %d\n", number1, number2 );  
	        if ( number1 != number2 )          
	            System.out.printf( "%d != %d\n", number1, number2 );  
	        if ( number1 < number2 )          
	            System.out.printf( "%d < %d\n", number1, number2 );  
	        if ( number1 > number2 )          
	            System.out.printf( "%d > %d\n", number1, number2 );  
	        if ( number1 <= number2 )          
	            System.out.printf( "%d <= %d\n", number1, number2 );  
	        if ( number1 >= number2 )          
	            System.out.printf( "%d >= %d\n", number1, number2 );  
	    }
	}


/*
	output:
	
Input Data: 
Input first integer: 25
Input second integer: 39
25 != 39
25 < 39
25 <= 39

	*/