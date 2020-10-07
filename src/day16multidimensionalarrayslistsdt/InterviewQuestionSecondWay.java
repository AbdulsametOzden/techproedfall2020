package day16multidimensionalarrayslistsdt;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestionSecondWay {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
        System.out.println("Enter a string");
        String s = scan.nextLine();
        
        String ch[] = s.split("");
        System.out.println(Arrays.toString(ch));
        
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        
        int counter = 0;
		for(int i=1; i<ch.length; i++) {
            if(ch[i-1].equals(ch[i])) {
                counter++;
            }else {
                System.out.println("The number of " + ch[i-1] +" is: "+ (counter+1));
                counter=0;
            }
            if(i==ch.length-1) {
                System.out.println("The number of " + ch[i] + " is: " +(counter +1));
            }
        }
		
		scan.close();

	}

}
