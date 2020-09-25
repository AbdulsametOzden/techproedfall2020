package day11dowhilemethodcreationnt;

public class MethodCreation02 {

	public static void main(String[] args) {
		
		add(3, 4); //add(int n1, int n2) is used     
		add(3.0, 4.0);//add(double n1, double n2) is used
		add(3, 4.0);//add(double n1, double n2) is used
		
		System.out.println(multiply(1.2, 5));//6.0

	}
	
	//Create 2 methods whose names are "add".
	//One will add the integers, the other one will add the doubles.
	public static void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	public static void add(double n1, double n2) {
		System.out.println(n1 + n2);
	}
	
	//Create a multiplication method with 2 parameters and make the return type double.
	
	/*
	 If the return type of the method is different from "void", you must use "return" keyword
	 in the last line of the method body
	 */
	public static double multiply(double n1, double n2) {
		return n1 * n2;
	}
}
