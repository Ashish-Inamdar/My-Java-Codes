package chapter_3;

/*A simple program to find if the user input value is Even or Odd*/

import java.util.Scanner ; // To import Scanner Class

public class EvenOdd {
Scanner sc=new Scanner(System.in) ; // Scanner Class object sc created.

private int num ;
public void getNum() // Function to get the value from the user
{
	System.out.println("Please Enter a number");
	num=sc.nextInt();
	System.out.println("Entered number is "+num);
}
public void cal() // Logic to check if the number is even or odd
{
	if(num%2==0)
		System.out.println("The number is Even");
	else 
		System.out.println("The number is Odd");
}

public static void main(String[] args) {
	
	EvenOdd obj1=new EvenOdd() ; // EvenOdd Class object created.
	obj1.getNum();
	obj1.cal();
}
	
}
