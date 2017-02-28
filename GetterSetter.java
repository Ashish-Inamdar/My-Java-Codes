package chapter_3;
/*Program to represent how Accessor Mutator methods are used to get and set the value of the variables*/
public class GetterSetter {
	private int id ;
	private String name ;
	
	public void getid(int id) // Getter method to get the value of ID
	{
		this.id=id ;
	}
	
	public void getname(String name) // Getter method to get the value of Name
	{
		this.name=name ;
	}
	
	public int setid() // Setter method to set the value of ID
	{
		return id ;
	}
	
	public String setname() // Setter method to set the value of Name
	{
		return name ;
	}
	public static void main(String[] args) {
		GetterSetter obj=new GetterSetter() ; // Class object initilazed 
		obj.getid(10);
		obj.getname("Ashish") ;
		System.out.println("The id of the Person is "+obj.setid());
		System.out.println("The name of the person is "+obj.setname());
	}
}

