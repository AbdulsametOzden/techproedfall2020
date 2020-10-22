package day25exceptions;

public class E03 {

	public static void main(String[] args) {
		
		/*
		 Create a division method.
		 Give an understandable message if the denominator is 0
		 ArithmeticException is used for arithmetic operations.
		*/
		int a = 12;
		int b = 0;
		
		System.out.println(a/b);
		
		try{
			
			System.out.println(a/b);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());// ==> / by zero
			System.out.println("Do not try to divide by 0");
			
		}finally {
			
			System.out.println("Done!");
			
		}

	}

}
