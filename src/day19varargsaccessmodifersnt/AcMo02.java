package day19varargsaccessmodifersnt;

import day18passbyvaluepassbyreferencedatetime.AcMo03;

public class AcMo02 extends AcMo03{

	public static void main(String[] args) {
		
		/*
		 1) In AcMo01, I created private, protected, default, and public instance variables.
		    In AcMo02, I created an object to access them but I could not access to the private one.
		    So private class members cannot be accessed from other classes.
		    
		 2) From different packages, you cannot access to default class members.
		    For example; if you create a variable in package A, you can acces to the variable from all
		    classes in the package A but you cannot acces to the variable from other packages.
		    
		 3) From different packages, you have 2 options for "protected" ones.
		    If you are in "Child" class, you can access to the protected ones.
		    If you are not in a "Child" class, you cannot acces to the protected ones.   
		    
		 4) public class members can be accessed from everywhere. There is no any restriction for 
		    public class members 
		    
		 Note: For classes, "private" and "protected" access modifiers cannot be used.
		       You can use just "public" or "default" access modifiers.     
		*/
		AcMo01 obj1 = new AcMo01();
		System.out.println(obj1.defaultAge);//27
		System.out.println(obj1.protectedAge);//25
		System.out.println(obj1.publicAge);//29
		
		AcMo03 obj2 = new AcMo03();
		System.out.println(obj2.publicName);
		System.out.println(obj2.protectedName);

	}

}
