package day16multidimensionalarrayslistsnt;

public class Question03 {

	public static void main(String[] args) {
		
		int arr[] = {3, 1, 7, 13, 9, 11};
		
		//Print just last 2 elements
		for(int i=0; i<arr.length; i++) {			
			if(i<arr.length-2) {
				continue;
			}
			System.out.print(arr[i] + " ");			
		}
		
		System.out.println();
		
		//Print just first 3 elements
		for(int i=0; i<arr.length; i++) {
			
			if(i>2) {
				break;
			}
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//Print the elements from index 2 to index 4
		for(int i=0; i<arr.length; i++) {
			if(i<2) {
				continue;//To skip steps in loop 
			}
			if(i>4) {
				break;//To break the loop
			}
			System.out.print(arr[i] + " ");
		}
	
	}

}
