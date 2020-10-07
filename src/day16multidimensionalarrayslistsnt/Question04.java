package day16multidimensionalarrayslistsnt;

public class Question04 {

	public static void main(String[] args) {
		
		int ma[][] = { {5}, {9, 6, 2}, {11, 12} };
		
		//Find the sum of all elements
		
		int sum = 0;
		
		for(int i=0; i<ma.length; i++) {

			for(int k=0; k<ma[i].length; k++) {
				
				sum = sum + ma[i][k];
				
			}
			
		}
		
		System.out.println(sum);
		
		//Find the mulltiplication of all elements (Homework)
		
	}

}
