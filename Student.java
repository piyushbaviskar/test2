import java.util.Scanner;

public class Student {
 
 int id;
 String name;
 String branch;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the Student id :: ");
  id = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the Branch:: ");
  branch = in.next();
  {
  System.out.println("New detail");}
 }
 
 public void display() {
  
  System.out.println("Student id = " + id);
  System.out.println("Student name = " + name);
  System.out.println("Student branch = " + branch);
 }
 
	public static void main(String[] args) {
		Student e[] = new Student[5];
		  
		  for(int i=0; i<5; i++) {
		   
		   e[i] = new Student();
		   e[i].getInput();
		  }
		  
		  System.out.println("Students Data Entered as below:");
		  
		  for(int i=0; i<5; i++) {
		   
		   e[i].display();

	}
	}}
