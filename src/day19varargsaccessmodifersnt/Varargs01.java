package day19varargsaccessmodifersnt;

public class Varargs01 {
	
	/*
	 1)If you want a method to run with different number of arguments, you can use 
	   "varargs(Variable Arguments)".
	 2)"varargs" can run with from 0 arguments to infinitely many, there is no any limitation
	 3)Varargs must be the last parameter everytime.
	 4)In a method as a parameter you can use just one varargs because, if you use more than 1 varargs
	   at least one of them will not be the last element. This is conflict with the 3rd rule.
	 */

	public static void main(String[] args) {
		
		add();
		add(3);
		add(3, 5, 7, 9, 11, 21);
		
		concat("*", "A", "l", "i");
		
		m(5, 6, 7, 8);
		
		m(11, 12);

	}	
	public static void add(int... a) {		
		int sum = 0;		
		for(int w : a) {
			sum = sum + w;
		}
		System.out.println(sum);
	}	
	public static void concat(String x, String... s) {		
		String result = "";	
		for(String w : s) {
			result = result + w + x;
		}	
		System.out.println(result);		
	}
	public static void m(int x, int y, int... z) {
		System.out.println(z.length);
	}

}
