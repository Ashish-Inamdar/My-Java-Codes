package chapter_3;
/*A basic program to store the ID and name for an Employee and display those value to the console*/

public class Employee {
	private int id ;
	private String name  ;
	
	Employee() // Default Constructor.
	{
		id=0 ;
		name="NULL" ;
	}
	
	Employee(int id, String name) // Parameterized Constructor takes int and String as argument.
	{
		
		this.id=id ;
		this.name=name ;
	}
	
	public void disp() // Display function to display the values
	{
		System.out.println("Details of the Employee");
		System.out.println("ID: "+id);
		System.out.println("Name "+name);
	}
	
	public static void main(String[] args) {
		
		Employee obj1 =new Employee() ; // Default Constructor invoked when object is initialized
		Employee obj2=new Employee(3865,"Ashish") ; // Parameterized Constructor invoked when object is initialized
		obj1.disp(); 
		obj2.disp();
	}

}
