package task3;

import java.util.Scanner;

public class Employee {
	 //declared below data members inside the class
	 private int Emp_id;                
	 private String Emp_FirstName;
	 private String Emp_LastName;
	 private int Emp_Salary;
	 
	 public Employee (int id, String firstName, String lastName, int Salary)  //Parameterized Constructor
	 {
		 this.Emp_id=id;               //initializing the values to variables through parameters
		 this.Emp_FirstName=firstName;
		 this.Emp_LastName=lastName;
		 this.Emp_Salary=Salary;
	 }
	 
	 public int getID()   //returning the Employee Id
	 {
		 return Emp_id;
	 }
	 
	 public String getFirstName()  //returning the First Name of the employee
	 {
		 return Emp_FirstName;
	 }
	 
	 public String getLastName()    //returning the Last Name of the Employee
	 {
		 return Emp_LastName;
	 }
	 
	 public String getName()    //returning name of the Employee
	 {
		 return Emp_FirstName+Emp_LastName;
	 }
	 
	 public int getSalary() //returning the salary
	 {
		 return Emp_Salary;
	 }
	 
	 public void setSalary(int NewSalary)  //setting the New salary through the parameter
	 {
		 Emp_Salary=NewSalary;
		 System.out.println("Employee's New Salary:" + Emp_Salary);
	 }
	 
	 public int getAnnualSalary()    //returning the annual Salary
	 {
		 return Emp_Salary*12;
	 }
	 
	 public int raiseSalary(int Emp_percent)    //returning the new salary with increased percent
	 {
		 return Emp_Salary*Emp_percent;
	 }
	 
	 public String toString()  //returning the employee information in given format
	 {
		 return ("Employee [ID="+ Emp_id+ ", Name=" +Emp_FirstName +" "+ Emp_LastName + ", Salary=" + Emp_Salary +"]");
	 }

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em1=new Employee(10063,"John","Smith",50000);   //Invoking the parameterized constructor by object creation
		System.out.println("Employee's ID: " + em1.getID());    //Printing the Id of employee by calling the getId method
		System.out.println("Employee's First Name: " + em1.getFirstName());  //Printing the first name of employee by getfirst mame method
		System.out.println("Employee's Last Name: " + em1.getLastName());  //printing the last name of employee by this get method
		System.out.println("Employee's Name: " + em1.getName());     //printing the name of employee by using this method
		em1.setSalary(650000);           //Setting the new salary
		System.out.println("Employee's Annual Salary: " + em1.getAnnualSalary());  //Annual Salary getting returned here by this getmethod
		Scanner sc=new Scanner(System.in);  //Scanner class created to get the integer value
		System.out.println("Enter the hike percent which you want:");  
		int percent=sc.nextInt();  //getting the percent as input from console
		System.out.println("Employee's updated Salary:" + em1.raiseSalary(percent));  //new hiked salary getting returned by this method
		System.out.println(em1.toString());  //printing the returning value from this method
		
		

	}

}
