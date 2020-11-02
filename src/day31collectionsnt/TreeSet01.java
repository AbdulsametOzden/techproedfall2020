package day31collectionsnt;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
	
	/*
	 1)All elements are unique
	 2)All elements are in natural order (ascending + alphabetical)
	 3)TreeSet is the slowest Set.
	 4)TreeSet does not accept null as element
	 
	 Note: If you need a collection whose elements are unque and in natural order
	       use TreeSet. But using TreeSet will make your program very slow, you nedd to do
	       something to make it faster.
	       
	 Question: If you need unique data in natural order what do you use?
	 Answer: I use TreeSet
	 
	 Question: But TreeSet is very slow. What do you do to make your code faster?
	 Answer: I use HashSet to add elements, then I convert HashSet to TreeSet      
	*/

	public static void main(String[] args) {
		
		LocalTime startingTime1 = LocalTime.now();
		System.out.println(startingTime1);
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Ali");
		ts1.add("Metin");
		ts1.add("Joe");
		ts1.add("Mary");
		ts1.add("Angie");
		System.out.println(ts1);//[Ali, Angie, Joe, Mary, Metin]
		
		ts1.add("Metin");
		System.out.println(ts1);//[Ali, Angie, Joe, Mary, Metin]
		
		//TreeSet does not accept null as element
		//ts1.add(null);
		//System.out.println(ts1);
		LocalTime endingTime1 = LocalTime.now();
		System.out.println(endingTime1);
		
		
		System.out.println("=====================");
		
		
		LocalTime startingTime2 = LocalTime.now();
		System.out.println(startingTime2);
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Ali");
		hs1.add("Metin");
		hs1.add("Joe");
		hs1.add("Mary");
		hs1.add("Angie");
		System.out.println(hs1);//[Ali, Metin, Joe, Mary, Angie]
		hs1.add("Metin");
		System.out.println(hs1);//[Ali, Metin, Joe, Mary, Angie]
		TreeSet<String> ts2 = new TreeSet<>(hs1); 
		System.out.println(ts2);
		LocalTime endingTime2 = LocalTime.now();
		System.out.println(endingTime2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
