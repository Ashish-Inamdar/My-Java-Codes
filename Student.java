package chapter_3;

public class Student {
 private int id=10 ;
 private String name="Ashish" ;
 public void display()
 {
	 System.out.println("Student Details are as follows: ");
	 System.out.println("Student Name: "+name);
	 System.out.println("Student Id: "+id);
 }
 
 public static void main(String[] args) {
	
	 Student s1=new Student() ;
	 s1.display(); 
}
}
