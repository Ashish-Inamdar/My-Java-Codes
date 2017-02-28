/**
 * 
 */
package collections;

import java.util.TreeSet;

/**
 * @author Ashish
 *
 * The following program demonstrates the use of Tree set.
 * 
 * Tree Set is based on natural order. It dosen't follow insertion order.
 *  
 * The set interface dosen't allow duplicate value.
 *
 */
public class Set3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> obj=new TreeSet<>(); // New Tree set is created to store String values.
		obj.add("A");
		obj.add("B");
		obj.add("G"); // Values are being added into the Tree set.
		obj.add("D");
		
		for(String i:obj) //Enhanced for loop is used to iterate the values inside Tree set.
		{
			System.out.println(i); // Values are being displayed.
		}
	}

}
