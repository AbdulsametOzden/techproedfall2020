package day31collectionsnt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet01 {
	
	/*
	 1)HashSet does not accept repeated data. All data must be unique in HashSet
	 2)HashSet is the fastest Set in Java.
	 3)HashSet does not put the elements in any order. Elements are ordered in random order.
	 4)"null" can be used as an element in HashSets
	 
	 Note: If you need a collection which has unique elements, order is not important, and
	       speed is very important for you, then use HashSet
	*/

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Ali");
		hs1.add("Metin");
		hs1.add("Joe");
		hs1.add("Mary");
		hs1.add("Angie");
		System.out.println(hs1);//[Joe, Angie, Metin, Ali, Mary]
		
		//If you try to add same element into a HashSet, you do not get CTE, you do not get Run Time Error
		//Java will overwrite.
		hs1.add("Ali");
		System.out.println(hs1);
		
		hs1.add(null);
		System.out.println(hs1);//[null, Joe, Angie, Metin, Ali, Mary]
		hs1.add(null);
		System.out.println(hs1);//[null, Joe, Angie, Metin, Ali, Mary]
		
		List<String> l1 = new ArrayList<>();
		l1.add("Metin");
		l1.add("Joe");
		System.out.println(hs1.containsAll(l1));//true
		l1.add("AAA");
		System.out.println(hs1.containsAll(l1));//false
		
		System.out.println(hs1.hashCode());//140174416

	}

}
