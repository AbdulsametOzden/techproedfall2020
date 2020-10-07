package day16multidimensionalarrayslistsnt;

import java.util.Arrays;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/* 
		   Create an array by the help of user
		   Ask user the element to remove 
		   Remove the element user asked
		   Print the array on the console after removing 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scan.nextInt();
		
		int arr[] = new int[length];
		
		int i = 0;
		
		do {
			System.out.println("Enter the value for index " + i);
			arr[i] = scan.nextInt();
			i++;
		}while(i<arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Tell me the index of the element you want to remove");
		int idx = scan.nextInt();
		
		
		if(idx<0 || idx>=arr.length) {
			System.out.println("Invalid index, reenter");
		}else {
					
			int m = 0;			
			int newArr[] = new int[length-1];
			
			for(int k=0; k<length; k++) {			
				if(k==idx) {
					continue;
				}			
				newArr[m] = arr[k];
				m++;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(newArr));
		}
		
		scan.close();

	}

}
