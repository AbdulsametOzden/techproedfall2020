package day28interface;

	/*
	 1)By using interface we can use multiple
	   inheritance in Java
	 2)Interface is not a class. Interface is an 
	   interface
	 3)Abstract classes may have abstract and concrete 
	   methods but interfaces may have JUST ABSTRACT methods.
	 4)For interfaces all methods are abstract as default.
	   Because of that, no need to use "abstract" keyword
	   for methods in an interface.
	   "public void seat();" is same with "public abstract void seat();" 
	 5)When you work in a class, if you remove access modifier it will be "default" but
	   when you work in an interface access modifiers of all methods will be public everytime
	   even you type access modifier or not. 
       "public void seat();" is same with "void seat();"
     6)For concrete and abstract classes we use "extends" keyword but for interfaces we use "implements"
       keyword. Both "extends" and "implements" can be used at the same time for a class to achieve 
       multiple inheritance.
     7)ALL methods in an interface must be "abstract" because of that interfaces are called 
       "Fully Abstraction", abstract classes are called "Partial Abstraction".
     8)When we have abstraction we cannot create objects because of that we cannot create objects 
       by using interfaces.  
     9)Class ===> Interface  use "implements"  
       Class ===> Class use "extends"
       Interface ===> Interface use "extends"
       Interface ===> Class !!!! A Class cannot be parent for an Interface !!!  
     10)If a concrete class have 2 interface parents, when you create methods with same method signature
        in parent interfaces, do not use different return types. Otherwise, Java cannot decide which one
        to override and starts to complain.   
	 */

public interface Inside {

	int PRICE = 20000;
	
	public void seat();
	
	public void steeringWheel();
	
	public void radio();
	
	void clean();

}
