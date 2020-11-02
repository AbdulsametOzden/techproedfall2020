package day27abstractionnt;

	/*
	 1)Sometimes we need methods without body, they are called 
	   "abstract methods"
	   Note: Sometimes all child classes update the method body when they
	         override and do not use the method from parent class without 
	         updating the method body. If the method body is not used any time
	         it is not meaningful to create method body. 
	 2)To create abstract methods a) You need to remove method body 
	                              b) You need to put "abstract" keyword
	                                 between access modifier and return type
	 3)You can create abstract methods just in abstract classes
	 4)To make a class abstract you must use "abstract" keyword
	   just after access modifier 
	 5)If a non-abstract(concrete) class is the child of an abstract class, it must override all 
	   abstract methods from the parent class. Otherwise, Java complains. 
	 6)You can create abstract and concrete methods in an abstract class. Both are allowed. 
	   You cannot create abstract methods in a concrete class.  
	 7)Concrete child classes must override abstract methods from the parent but overriding concrete
	   methods is optional. If child class need it, it can override. 
	 8)To make some features must for child classes we create abstract methods in parent classes.
	 9)Java does not support multiple inheritance for concrete parents, same rule is valid for 
	   abstract parents as well.  
	 10)For a method you cannot use "abstract" keyword and method body together. If there is body do not use
	   "abstract" keyword, if there is "abstract" keyword do not use method body. 
	 11)An abstract method cannot be final. Because, we create abstract methods for child classes. 
	    Child classes will override and use the abstract methods. If you make it "final" it means it cannot
	    be overridden. This is contradiction.Because of that, Java does not let you to make an abstract
	    method "final" 
    12)An abstract method cannot be private. Because, we create abstract methods for child classes. 
       Child classes will override and use the abstract methods. If you make it "private" it means it cannot
       be overridden. This is contradiction. Because of that, Java does not let you to make an abstract
       method "private". For abstract methods we use "public" and "protected". "default" can be used but
       not recommended.
    13)An abstract method cannot be static. Because, we create abstract methods for child classes. 
       Child classes will override and use the abstract methods. If you make it "static" it means it cannot
       be overridden. This is contradiction. Because of that, Java does not let you to make an abstract
       method "static". 
       
                                          !!!  WE CANNOT CREATE OBJECT BY USING ABSTRACT CLASSES !!!
   */

public abstract class Honda {
	
	public abstract void engine(); 
	
	public void leather() {
		System.out.println("It has genuine leather seats");
	}

}
