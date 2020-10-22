package day24overridingexceptionsdt;

public class Overriding {

	/*
	 1)final, static, and private methods CANNOT be overridden.
	   final: final method means, method body cannot be changed but in overriding
	          our goal is to change the method body. Because of that Java does not allow
	          to override final methods.
	   static: static things are common for all objects.When you change them, 
	           it will be changed for all objects. Because of that no need to override to change
	           method body.
	   private: To override a method you have to access it first. 
	            But private methods cannot be accessed from other classes. Do not forget
	            for private clas members, you can do nothing from the other classes except
	            creating getters and setters. 
	 2)If you do not put "@Override" annotation, Java does not check Override rules
	   and does not give Compile Time Error. If you do not put "@Override" annotation
	   Java will accept the methods completely different methods and you will not get any 
	   Compile Time Error. 
	 3)What are the differences between "Method Overloading" and "Method Overriding"? 
	    a)In "Method Overloading" we change method signature(We are changing parameters) but
	      in "Method Overriding" we do not touch method signature.
	    b)In "Method Overloading" we do not change method body most of the times, but   
	      in "Method Overriding" we change the method body most of the times.
	    c)In "Method Overloading" we work in the same class, we do not need inheritance, but
	      in "Method Overriding" we work in different classes, we need inheritance.
	      If there is no inheritance there is no "Method Overriding" 
	    d)"Method Overloading" is done in Compile Time, because of that "Method Overloading" is called
	      "Compile Time Polymorphism"."Method Overriding" is done in Run Time, because of that
	      "Method Overriding" is called "Run Time Polymorphism" 
	 4)What is the "polymorphism" in Java?
	    Polymorphism is "Method Overloading" and "Method Overriding"
	    
	 5)Explain "final" keyword in Java.         
	   a)final variable: If you use "final" keyword for a variable, it means you cannot modify
	                     its value. 
	                     If you use "final" keyword for a variable, you have to "initialize" it.
	                     otherwise, you will get CTE
	                     If you use "final" keyword for a variable, name it by using uppercases.
	   b)final methods:  If you use "final" keyword for a method, it means the method cannot be 
	                     overridden.If you want the implementation of a method to be unchangable
	                     make it final. So nobody can change the method body.  
	   c)final classes:  If you use "final" keyword for a class, it means the class cannot have a
	                     child class. Child classes cannot be inherited. Other classes cannot extend
	                     to the final class.                                                	                
	 */
	
	final int AGE = 23;
	
	public static void main(String[] args) {
		
		Overriding obj = new Overriding();
		System.out.println(obj.AGE);
		
	}

}
