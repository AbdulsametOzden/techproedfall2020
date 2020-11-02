package day32collectionsmaps;

import java.util.TreeMap;

public class TreeMap01 {
	
	/*
	 1)TreeMap puts the elements in natural order
	 2)TreeMap is the solwest Map
	 3)TreeMap is not-synchronized and not-thread-safe
	 4)TreeMap does not accept null as key, but accepts multiple null as value.
	*/

	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> tm1 = new TreeMap<>();
		tm1.put(123, 6);
		tm1.put(98, 17);
		tm1.put(1001, 2);
		tm1.put(321, 6);
		System.out.println(tm1);//{98=17, 123=6, 321=6, 1001=2}
		
		//tm1.put(null, 0);
		//System.out.println(tm1);//NullPointerException
		
		tm1.put(111, null);
		tm1.put(112, null);
		System.out.println(tm1);

	}

}
