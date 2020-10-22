package day25exceptions;

public class E05 {

	public static void main(String[] args) {
		
		int arr[] = {9, 8, 7, 6};
		
		/*
		 ArrayIndexOutOfBoundsException is thrown if you use nun-existing index for an array
		*/
		try {
			System.out.println(arr[4]);// ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());//4
			
			//To get detailed information about the Exception
			//use printStackTrace() method. It will display Exception step by step.
			e.printStackTrace();// java.lang.ArrayIndexOutOfBoundsException: 4
	                            // at day25exceptions.E05.main(E05.java:10)
		}

	}

}
