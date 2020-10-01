package day12methodcreationconstructorsnt;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		add(3.2, 4.8);//8.0
		System.out.println(add(5,7));//12

	}
	
	//Create "add" method with 2 double parameters, call it from inside the main method
	public static void add(double n1, double n2) {
		System.out.println(n1 + n2);
	}
	
	//When you use return type different from "void", you have to use "return" keyword at the end
	//Return type of a method can be all primitive data types and non-primitive data types
	public static int add(int n1, int n2) {
		return n1 + n2;
	}

}
