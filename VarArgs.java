/**
 * 
 */
package chapter_3;


/**
 * @author Ashish
 * This program demonstrates the use of Variable Arguments or VarArgs with which multiple parameters can be
 * passed to a single function.
 */
public class VarArgs {	
	public void disp(int ...x) // The 3 dots(...) represents that the method will take multiple arguments.
	{
		for(int i:x) // Using enhanced for loop to display the multiple values.
			System.out.println(i);
	}
	public static void main(String[] args) {
		VarArgs obj=new VarArgs();
		obj.disp(5,10,15,20,25,30,35,40,45,50); // Passing multiple arguments to the method.
	}

}
