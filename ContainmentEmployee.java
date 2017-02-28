/**
 * 
 */
package chapter_4;

import chapter_3.MyDate;

/**
 * @author Ashish
 *This program shows the concepts of containment which aids in code re-usability.
 */
public class ContainmentEmployee {
	
	private int id ;
	private String name ;
	MyDate doj ; // Object of MyDate Class.
	
	ContainmentEmployee()
	{
		id=0 ;
		name=" " ;
		doj= new MyDate() ; // ContainmentEmployee variable doj initialized through constructor on MyDate class.
	}
	
	ContainmentEmployee(int id,String name, MyDate d)
	{
		this.id=id ;
		this.name=name ;
		doj=d ;
	}
	
	public void disp()
	{
		System.out.println("Employee Details are: ");
		System.out.println("ID: "+ id);
		System.out.println("Name: "+name);
		System.out.println("Date of Joining: "+doj);
	}
	
	public static void main(String[] args) {
		
		ContainmentEmployee obj=new ContainmentEmployee() ;
		ContainmentEmployee obj1=new ContainmentEmployee(3865,"Ashish", new MyDate(6,9,2016)) ;
/*Date of Joining value passed through the constructor of the Mydate class which initialize the variable doj to the value 6/9/2016*/
		obj.disp();
		obj1.disp();
	}

}
