package day11dowhilemethodcreationnt;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter password.
		 If the password has more than 6 characters print "It is okay"
		 Otherwise, print "Make the password longer than 6 characters" and ask user to enter a new password
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String s = "";
		do {
			System.out.println("Enter your password");
			s = scan.nextLine();
			if(s.length()>6 && s.charAt(0)=='A') {
				System.out.println("It is okay");
			}else {
				System.out.println("Make the length longer than 6");
			}	
		}while(!(s.length()>6));

		scan.close();
	}

}
