package day19varargsaccessmodifierdt;

public class AccessModifiers01 {
	
	/*
	 1) If a class member is "private" it can be seen, used, accessed just from inside the class.
	    If you are in a different lass, "private class members" cannot be seen, used, accessed.
	    
	 2) If a class member is "default", it cannot be seen, used, accessed from other packages. 
	    "default" and "package private" are synonims.  
	    
	 3) If a class is "public", it can be accessed from everywhere, there is no any restriction.
	 
	 4) If a class member is "protected", it can be accessed from the package and 
	    it can be accessed from classes in different packages if the class is child class. 
	*/
	
	private int privateAge = 23;
	public  int publicAge = 25;
	int defaultAge = 27;

	public static void main(String[] args) {

	}

}
