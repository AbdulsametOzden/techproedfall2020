package day26exceptions;

public class Test {
	
	public static void main(String[] args) {

		Integer z = 0;

		try {			

		   String s = "abcd";

		   z = Integer.parseInt(s);	
		   
		   //When we get exception the codes after the exception inside the try block do not run but the codes
		   //outside the try block run
		   
		   System.out.println("XXXXXX");//Doe not run

		}catch(NumberFormatException e) {			

			System.out.println("Good");			

		}

		System.out.println(z);//runs

	}
}
