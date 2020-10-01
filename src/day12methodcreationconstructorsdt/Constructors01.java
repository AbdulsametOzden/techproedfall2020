package day12methodcreationconstructorsdt;

public class Constructors01 {
	
	/*
	 1)Constructors are used to create objects from Classes
	 2)When you create a class, Java gives you a constructor. Because Java knows 
	   classes are used to create objects.
	 3)The constructor Java gave is invisible inside the class, it is called "default constructor"
	 4)Syntax of the constructor is "public Constructors01(){ }"
	 5) a) Constructor's name must be same with the class name
	    b) Constructors do not have return type
	    c) Constructors do not have return type because of that do not mention them as method.
	       Constructors are not methods. Constructors are constructors.
	 6)When you create any constructor inside the class, Java cancels default constructor.            
	*/
	
	public Constructors01() {
		System.out.println("The constructor I created");
	}
	
	public Constructors01(int i) {
		System.out.println("I used the constructor with parameters");
	}
	
	//Create a constructor with 2 parameters and create an object by using the constructor
	public Constructors01(String s, double d) {
		System.out.println("1st parameter is " + s + " and " + "2nd parameter is " + d);
	}
	

	public static void main(String[] args) {
		//Class name   Object name     Keyword          Constructor   
	   Constructors01     obj1        =   new         Constructors01();
	   Constructors01     obj2        =   new         Constructors01(5);
	   Constructors01     obj3        =   new         Constructors01("Java", 8.0);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
