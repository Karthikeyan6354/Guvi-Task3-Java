package task3;

public class Question1CallingPersonClass {
    
	//Accessing the constructor from different class
	public static void main(String[] args) {
		//To access the variables ad methods from the Person class
		
		Person P1=new Person("Mark", 25);   //Invoking the Parameterized Constructor
		System.out.println("Name of the Person: " + P1.getName()); //getting the name by calling getName method, which from Person Class
		System.out.println("Age of the Person: " + P1.getAge()); //getting the age by calling getAge method, Which from Person Class
		
		

	}

}
