package task3;

public class Circle {
	
	private double radius; //created radius as data member 
	
	public Circle ()   //Default Constructor - No arguments
	{
		this.radius=8.5;    //Initialized some default value to the radius
		System.out.println("Radius of the Circle is: " + radius);
	}
	
	public Circle(double CirRad, String CirCol)  //Constructor with 2 arguments - Radius and Color
	{
		radius = CirRad;   //Assigning the value to radius 
		System.out.println("Colour of the Circle is: " + CirCol);
		System.out.println("Radius of the Circle is: " + radius);
	}

    public double Cirumference()  //Method to calculate the Circumference of circle
    {
    	return 2*Math.PI*radius;   //returning the Value of circumference by using this formula
    }
 
	public static void main(String[] args) {
		// To Calculate the circumference of the circle by accessing the circle class
      
	  Circle cr=new Circle();  //Invoking the default constructor
      System.out.println("Circumferene of the Circle is : " + cr.Cirumference());
      
      Circle cr1=new Circle(5.5, "Blue"); //Invoking the 2 Parameterized constructor, and assigning the value to the variable
      System.out.println("Circumferene of the Circle is :" +cr1.Cirumference());  //Circumference method called here to get the output
    
    		  
		
	}
}
