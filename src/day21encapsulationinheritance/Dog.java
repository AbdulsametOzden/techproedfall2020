package day21encapsulationinheritance;

public class Dog extends Mammal {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 1)If you create parent(super)-child(sub) relationship between the classes
	   "child class(sub class)" can use every class member whose
	   access modifier is "public" or "protected".
	   "private" class members cannot be used from other classes
	   even they are child classes.
	   "default" classmembers can be used from inside the package
	   because of that, if the child class is in the same package
	   with the default class member, they can be used.
	   
	 2)To create parent-child relationship we use "extends" keyword.
	 
	 3)Parent class cannot use the class members from child class. 
	 
	 4)Advantages of "parent-child relationship(inheritance)" are
	   a)Reusability: You put common features into parent class, then all child classes will be
	                  able to use it.
	   b)Less coding: If you do not put common features int parent class, you should put it into
	                  every child class one by one. It needs to type same code again again.
	   c)Maintain: If you need to update something, it will be easy because, when you update the method
	               in parent class the method will be updated for all child classes. 
	               
	 5)In Java, a child class cannot have multiple parents.Java does not support multiple inheritance.
	   Because, multiple inheritance creates proablem when the parent classes have the methods whose
	   names are same.  
	   
	 6)If you have methods whose names are same in parent classes, child class will use the closest one   
	 
	 
	 7)a) If a parent class has multiple child classes,
	      that kind of inheritance is called "Hierarchical Inheritance"    
	      
	   b) If there is child-parent-granparent-..., it is called "Multilevel Inheritance"                                       
	*/
	
	public Dog() {
		System.out.println("Dog Constructor");
	}

	public static void main(String[] args) {

	}
	
	public void bark() {
		System.out.println("Dogs bark");
	}
	
	public void smellWell() {
		System.out.println("Dogs smell well");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
