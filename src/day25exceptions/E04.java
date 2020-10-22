package day25exceptions;

public class E04 {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.length());//0
		
		String s2 = null;
		
		try{
			
			System.out.println(s2.length());//NullPointerException
			
		}catch(NullPointerException e) {
			//Every Exception class has a specific Exception message.
			//If you want to see just the message on the console use getMessage()
			System.out.println(e.getMessage());//null
			System.out.println("The String is null object, for null objects length() method does not run");
			
		}

	}

}
