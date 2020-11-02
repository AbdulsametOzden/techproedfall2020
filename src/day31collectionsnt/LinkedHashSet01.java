package day31collectionsnt;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	
	/*
	 1)Elements are unique
	 2)Elements are in insertion order
	 3)It accepts "null" as value.
	 
	 Note: If you need a collection which has unique elements ordered in insertion order
	       use LinkedHashSet
	       
	 Note: Java creates codes for every data by using "hashing technique".
	       "hashing technique" is a technique to create unique codes. 
	       Java finds some codes to make sure all hash codes are unique.     
	 */

	public static void main(String[] args) {
		
		LocalTime startingTime1 = LocalTime.now();
		System.out.println(startingTime1);
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("Ali");
		lhs1.add("Metin");
		lhs1.add("Joe");
		lhs1.add("Mary");
		lhs1.add("Angie");
		System.out.println(lhs1);//[Ali, Metin, Joe, Mary, Angie]
		
		lhs1.add("Joe");
		System.out.println(lhs1);//[Ali, Metin, Joe, Mary, Angie]
		
		lhs1.add(null);
		System.out.println(lhs1);//[Ali, Metin, Joe, Mary, Angie, null]
		LocalTime endingTime1 = LocalTime.now();
		System.out.println(endingTime1);
		
		System.out.println("================================");
		
		LocalTime startingTime2 = LocalTime.now();
		System.out.println(startingTime2);
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Ali");
		hs1.add("Metin");
		hs1.add("Joe");
		hs1.add("Mary");
		hs1.add("Angie");
		System.out.println(hs1);//[Ali, Metin, Joe, Mary, Angie]
		
		hs1.add("Joe");
		System.out.println(hs1);//[Ali, Metin, Joe, Mary, Angie]
		
		hs1.add(null);
		System.out.println(hs1);//[Ali, Metin, Joe, Mary, Angie, null]
		LocalTime endingTime2 = LocalTime.now();
		System.out.println(endingTime2);


	}

}
