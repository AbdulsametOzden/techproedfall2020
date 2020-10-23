package day27abstractiondt;

public abstract class A01 {
	/*
	 1)Sometimes we need methods without body, that kind of methods are
	   called "abstract methods". The methods which have body are called
	   "concrete methods"
	 2)If a method is "abstract" child classes MUST override them 
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
	 */
	
	public abstract void engine();
	
	public void price() {
		
	}
}
