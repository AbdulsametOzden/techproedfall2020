package day27abstractiondt;

public abstract class A01 {
	/*
	 1)Sometimes we need methods without body, that kind of methods are
	   called "abstract methods". The methods which have body are called
	   "concrete methods"
	 2)If a method is "abstract" concrete child classes MUST override them 
	 3)To make a method "abstract" you have to type "abstract"
	   between access modifier and return type. 
	 4)You cannot create "abstract methods" inside a 
	   "concrete class". You can create "abstract methods" just
	   in "abstract classes"
	 5)To make a class abstract type "abstract" between access modifier and 
	   "class" keyword.
	 6)You cannot create an object from an "abstract class". 
	 7)You can create "concrete and abstract methods" in "abstract classes" but 
	   for concrete classes you can use just "concrete methods"  
	 8)If you use "abstract" keyword for a method, you cannot use method body. If you do it 
	   Java gives CTE. 
	 9)Concrete child class of an abstract class MUST override abstract methods from parent abstract class
	   otherwise you get CTE. But if the child class is abstract as well, it is optional to override 
	   abstract methods.  
	 10)For concrete and abstract child classes of an abstarct parent class, it is optional to override
	    concrete methods  
	 11)Multiple inheritance cannot be used for abstract classes as well. 
	 12)As you should know, final classes cannot have child classes. But when we create an abstract we use it
	    as a method storage for child classes. So when I create an abstract class I need child classes. Because
	    of that Java does not let an abstract class to be "final"   
	 13)As you know, final methods cannot be overridden but abstract methods are created to be overridden.
	    If you make an abstract method "final", it means it cannot be overridden. This is contradiction.
	    Because of that Java does not let an abstract method to be final.
	 14)"private" methods cannot be accessed from other classes. We create abstract methods to access from 
	    child classes. Because of that if you make an abstract class "private" Java will give CTE.   
	 15)abstract methods cannot be "static" because, we create abstract methods to override but static methods
	    cannot be ovrridden.              
	*/
	
	public abstract void engine();
	
	public void price() {
		
	}
}
