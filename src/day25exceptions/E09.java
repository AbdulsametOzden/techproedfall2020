package day25exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E09 {
	
	/*
	 1)"throws" keyword is used after the method parenthesis before the "{"
	   "throw" keyword is used in method body
	 2)By using "throw" keyword you can throw just one Exception, but by using "throws" 
	   keyword you can throw multiple Exceptions by putting comma between them 
	 3)"throw" keyword is used to throw Exception explicitly whereever we want, "throws"
	   keyword can be used just once in the method signature line.
	 4)After "throw" keyword we have to create an Exception Class object because of that
	   we have to use "new" keyword and "constructor" but after "throws" keyword we use 
	   just the name of the Exception Class.     
	 */

	public static void main(String[] args) throws ArithmeticException, IOException {
		
		FileInputStream fis = new FileInputStream("src/day25exceptions/TextFile");
		fis.close();
		
		int age = 12;
		if(age<0) {
			throw new IllegalArgumentException();
		}else {
			System.out.println(age);
		}

	}

}
