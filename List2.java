/**
 * 
 */
package collections;

import java.util.LinkedList;
/**
 * @author Ashish
 * 
 * The following program demonstrates the use of Linked List without the Iterator
 * 
 * The internal structure of Linked List is Double Linked List.
 * 
 * The List interface allows duplicate value and the output is based on insertion order.
 *
 */
public class List2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> obj=new LinkedList<>(); // New Linked List is created of type String.
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");  // String value are added to the Linked List.
		obj.add("E");
		obj.add("F");
		obj.add("G");
		obj.add("H");
		
		for(String i:obj) // Enhanced for loop is used to iterate through the Linked List
		{
			System.out.println(i); // Values are printed to the console.
		}
	}

}
