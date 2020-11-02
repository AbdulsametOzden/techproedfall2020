package day28interface;

public interface Outside {
	
	/*
	 1)When you create a variable in an interface 
	   you must initialize(assign a value) it.
	 2)final variables are made bold. In an interface 
	   all variables are "final" as default.
	   In an interface, all variables have constant values. 
	 3)All variables in an interface are "static"  
	 4)Access modifiers of all variables are "public" 
	   Note: "public final static int NUM =12;" is same with "int NUM = 12;"
	   Note: For names of final variables, use uppercases for all characters.
	 5)Until Java 8, it was impossible to create "concrete methods" in an interface. 
	   But in Java 8, Java gave us an option to create "concrete methods" in an interface
	   by using "default" or "static" keywords.  
	   Note: "default" keyword which you use to create concrete
	   method is not access modifier.
	*/
	
	int NUM = 12;
	int PRICE = 30000;
	
	void tire();//public and abstract as default
	public void hood();
	public void headLight();
	void clean();

	public default void polish() {
		System.out.println("Polish the car");
	}
	
	public static void sunroof() {
		System.out.println("It has sunroof");
	}

}
