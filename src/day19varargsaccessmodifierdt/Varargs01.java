package day19varargsaccessmodifierdt;

public class Varargs01 {
	
	/*
	 1)If you use varargs in a method parenthesis, always it should be the last parameter.
	 2)You cannot use more than 1 varargs in a method parenthesis
	*/

	public static void main(String[] args) {
		
		addByVarargs(3,5);
		addByVarargs(3, 5, 10);
		addByVarargs();
		addByVarargs(2);
		addByVarargs(2, 4, 6, 8, 10);
		multiplyByVarargs("Result: ", 2,3,4,5);//Result: 120.0
	}

	public static void addByVarargs(int... a) {
		int sum = 0;
		for(int w : a) {
			sum = sum + w;
		}
		System.out.println(sum);
	}
	
	public static void multiplyByVarargs(String s, double... b) {
		
		double product = 1;
		for(double w : b) {
			product = product * w;
		}
		System.out.println(s + product);
	}

}
