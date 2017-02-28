/**
 * 
 */
package chapter_4;

import java.util.*;
/**
 * @author Ashish
 * This programs displays the any given sting in reverse order without using in-built methods.
 * 
 *
 */
public class ReverseString {
	private String s, rev=""; //Two variables defined one to get a string value and other to hold the reverse value of string.
	
	public void getDetails() // Method to get the values of string from the user.
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		s=sc.nextLine();
		System.out.println("The entered string is "+s);
		sc.close();
	}
	
	public void reverse() // Logic which reverses the string.
	{
		int length=s.length();
		for(int i=length-1;i>=0;i--) // Loop running from the last character of the string till the first.
		{
			rev=rev+s.charAt(i); // Storing the reverse value to rev variable.
		}
		System.out.println("Reverse of String is "+rev);
	}
	
	public static void main(String[] args) {
		ReverseString obj=new ReverseString(); // Object is created.
		obj.getDetails(); // getDetails method called to get a value of the string fromt the user.
		obj.reverse(); // reverse method called to reverse the user given string.
		}
}
	
