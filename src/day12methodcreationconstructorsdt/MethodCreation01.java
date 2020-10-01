package day12methodcreationconstructorsdt;

public class MethodCreation01 {

	public static void main(String[] args) {
		add(5.0,4);//9.0
		add(3, 4);
	}
	
	/*
	Create 3 methods whose names are "add".
	1st one has 2 int parameters
	2nd one has 2 double parameters
	3rd one has 1 int, 1 double parameters
	*/
	
	/*
	 1)If there is complete match, Java uses the complete match method
	 2)If there is no complete match, Java selects the method which has Auto Widening
	 3)If there is no complete match and Auto Widening Java will give Compile Time Error.
	*/
	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public static void add(int num1, double num2) {
		System.out.println(num1+num2);
	}

}
