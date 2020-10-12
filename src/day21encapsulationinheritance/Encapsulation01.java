package day21encapsulationinheritance;

public class Encapsulation01 {
	
	/*
	 1)We use "encapsulation" to hide data and method implementations.
	 2)Encapsulated codes should have following characteristics:
	    a)Everyone knows how to access to the ecnapsulated data or method
	    b)It should be used easily even the code is complicated
	    c)There should not any side effects of the code, to the rest of the application
	    
	 3)How to make encapsulation 
	    a)Make the access modifier "private"
	    b)Create "getter" and "setter" methods.
	      "getter method" is used to read the encapsulated data 
	      "setter method" is used to update the encapsulated data
	      
	 4)The advantages of Encapsulation
	   a)It gives us flexibility, whenever we want we can update encapsulated data by using setter methods
	   b)Reusability, we craete getter and setter methods just once and use them again and again from
	     different classes.
	   c)Maintainability, by using setter methods we can update the value whenever we want. 
	   
	 5)After creating private variables, if you do not create any setter method, it means nothing will
	   be updated in the class.Because of that the class is called "Immutable Class"       
	*/
	
	private String collegeName = "FIU";
	private int age = 23;
	private boolean old = false;

	public static void main(String[] args) {
		
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//For booleans getter method's name starts with "is"
	public boolean isOld() {
		return old;
	}

	public void setOld(boolean old) {
		this.old = old;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
