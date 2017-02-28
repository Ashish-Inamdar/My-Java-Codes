/**
 * 
 */
package chapter_3;

/**
 * @author Ashish
 * Constructor Overloading implemented through the use of two constructors one of which is default and the
 * other is parameterized which takes two integer arguments and find the total of two subjects and then calculate
 * the average of two subjects.
 *
 */
public class Average {
	@SuppressWarnings("unused")
	private int sub1, sub2,tot ;
	private float avg ;
	
	Average() // Default Constructor
	{
		sub1=sub2=0 ;
	}
	
	Average(int sub1,int sub2) // Overloaded Parameterized Constructor
	{
		this.sub1=sub1 ;
		this.sub2=sub2 ;
		tot= sub1+sub2 ; // Total of two subjects
		System.out.println("The value of two subjects are "+sub1+" and "+sub2+"\n");
		System.out.println("The total of 2 Subjects are: "+tot);
		avg=tot/2 ; // Average of two subjects
		System.out.println("the Average of two Subjects is "+avg);
	}
	public static void main(String[] args) {
		
		Average obj1=new Average() ; // Call to Default constructor when object is initialized
		Average obj2=new Average(10,20) ;// Call to Overloaded PArametrized Constructor when the object is initialized 
	}
}
