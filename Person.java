package task3;

public class Person 
{
	// To create a constructor with getter methods
	private int PerAge;
	private String PerName;
	
	Person(String name, int age)  //Created Parameterized Constructor - Void is default
	{
		PerAge=age;
		PerName=name;	    //Initializing the values to variables
	}	
	public int getAge()    //Method to return the age
	{
		return PerAge;    //returning the age, when calling this method
	}
	public String getName()    //Method to return the Name
	{
		return PerName;      //returning the name, when calling this method
	}
	
	//Accessing the constructor from same class
	/*public static void main(String[] args) {
		
		Person Pr=new Person("Mark",25);   //Invoking the constructor and passing the arguments through object creation
		System.out.println("Person Name:" + Pr.getName());  //getting the name by using this user defined method
		System.out.println("Person Age:" + Pr.getAge());   //getting the age by using this user defined method
	}*/

}
