package day23overridingdt;

public class Ovr01 {

	/*
	 1)If you change the body of a method which is in parent class when you use
	   it in child class, it means you are "overriding the method".
	 2)When you override a method if you need  you can change the return type ans
	   access modifier, it is accepted in overriding BUT you CANNOT change
	   the Method Signature(method name and the parameters).  
	 3)If you use "@Override" annotation before the overriding method, Java will
	   check if the Overriding is done correctly or not.
	 4)The method which is overridden from parent class is called "Overridden Method"
	   When you override the method which is created in Child class is called
	   "Overriding Method"
	 5)Overriding is done so that the child class can give its own implementation 
	   to the method which is provided by the parent class. 
	 6)We can use different "access modifiers" for "Overridden" and "Overriding"
	   methods.But "Overriding" method's access modifier should be same or wider than
	   "Overridden" method's access modifier. 
	 7)We can use different "return types" for "Overridden" and "Overriding"
	   methods. But the return type of "Overriding" method should be same or smaller(Child) than the 
	   return type of "Overridden" method. 
	 8)If you are using primitives as return type in overriding, you CANNOT use different return types for
	   "Overridden" and "Overriding" methods.  
	 9)If you are using Wrapper Classes as return type in overriding, you CANNOT use different return types for
	   "Overridden" and "Overriding" methods. Because, there is no parent child relationship between Wrapper Classes
	   As a conclusion; In overriding, "Overriding" method can use the same return type with the "Overridden" method
	                    or can use child classes as return type. 
	                    In Overriding, you should have "IS-A" relationship from
	                    "Overriding" method to "Overridden" method for return types.
	*/

}
