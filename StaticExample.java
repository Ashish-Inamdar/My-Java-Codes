/**
 * 
 */
package chapter_3;

import java.util.Scanner ; // To use Scanner Class
/**
 * @author Ashish
 * Program to show the use of Static Variable. Static variable is called through the class name rather than an\
 * object since that variable is static throughout the program. A single copy is created for the static variable
 * which is initialized to zero by default.
 */
public class StaticExample {
	private int id ;
	private String name ;
	private static String schName ;
	
	public void getDetails() // Gets the details from the user using Scanner
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		id=sc.nextInt() ; 
		System.out.println("Enter Student Name: ");
		name=sc.next() ;
		System.out.println("Enter School Name: ");
		schName=sc.next() ;
		sc.close();
	}
	
	public void disp() // Function to display the values
	{
		System.out.println("Student Details:");
		System.out.println("Student ID: "+ id);
		System.out.println("Student Name: "+name);
		System.out.println("School Name: "+schName);
		System.out.println();
	}
	
	public static void main(String[] args) {
		StaticExample obj=new StaticExample() ;
		obj.id=3865 ;
		obj.name="Ashish" ;
		StaticExample.schName="XYZ"; // Static variable accessed through class name rather than object
		obj.disp();
		obj.getDetails();
		obj.disp();
	}

}
