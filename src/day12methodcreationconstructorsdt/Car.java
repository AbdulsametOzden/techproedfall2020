package day12methodcreationconstructorsdt;

public class Car {
	
	/*
	 If you create variables out of the main method, the variables are called "instance variables"
	 If you create variables inside a method body, the variables are called "local variables"
	 Differences between "instance" and "local" variables:
	      1)When you create instance variables, no need to assign any value. But for local variables
	        you need to initialize 
	        If you assign a value for a variable when you create it, it means you "initialized"
	        Java assigns default values to instance variables.
	        Default values for byte, short, int, long is 0
	                       for float and double is 0.0
	                       for boolean is false
	                       for Strings null
	                       for char '\u0000'==> 0
	      2)Instance variables can be used in entire class, but local variables can be used just in the method body                
	                       
	 */
	int price;
	String make;
	String model;
	int year;
	String color;
	String engine;
	int milage;
	boolean isGas;
	
	public Car() {
		
	}
	
	public Car(int price, String make, String model, int year) {
		
		this.price = price;
		this.make = make;
		this.model = model;
		this.year = year;
		
	}

	public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.price);//0
        System.out.println(car1.isGas);//false
        
        
        Car car2 = new Car(20000, "Audi", "R8", 2018);
        System.out.println(car2.price);//20000
        System.out.println(car2.make);//Audi
        System.out.println(car2.model);//R8
        System.out.println(car2.year);//2018
	}

}
