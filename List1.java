/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Ashish
 * 
 * The following program shows the use of Array List and iterating the list with the help of Iterator.
 * 
 * The internal structure of the Array List is array.
 * 
 * The List interface allows duplicate value and the output is based on insertion order. 
 *
 */
public class List1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> obj=new ArrayList<>(); // An array list of integer type is created 		
		obj.add(2);
		obj.add(3);
		obj.add(4); // Values are added to the array list
		obj.add(5);
		obj.add(6);
		obj.add(7);
		
		Iterator<Integer> it=obj.iterator(); // Iterator object it is created 
		while(it.hasNext()) // Iterator is used to iterate collected objects.
		{
			System.out.println(it.next()); // Displays the value in the list.
		}
	}
}
