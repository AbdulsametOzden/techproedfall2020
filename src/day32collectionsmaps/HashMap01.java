package day32collectionsmaps;

import java.util.HashMap;

public class HashMap01 {
	
	/*
	 1)Maps uses "{  }"
	 2)All elements of Maps are in 
	   key-value structure
	 3)Keys must be unique
	 4)Values can be repeated  
	*/
	
	/*
	 1)HashMap is the fastest map
	 2)HashMap does not put the elements in any order. Elements are in random order.
	 3)If you use same key to put a new element, it overwrites.
	 4)You can use just one "null" as key.
	 5)You can use multiple "null" for values.
	 6)HashMap is not-synchronized and not thread-safe
	 */

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		hm1.put(101, "Milk");
		hm1.put(102, "Cheese");
		hm1.put(103, "Meat");
		hm1.put(100, "Butter");
		hm1.put(107, "Honey");
		hm1.put(108, "Pastirami");
		System.out.println(hm1);//{100=Butter, 101=Milk, 102=Cheese, 103=Meat, 107=Honey, 108=Pastirami}
		
		hm1.put(101, "Orange");
		System.out.println(hm1);//{100=Butter, 101=Orange, 102=Cheese, 103=Meat, 107=Honey, 108=Pastirami}
		
		hm1.put(110, "Butter");
		System.out.println(hm1);//{100=Butter, 101=Orange, 102=Cheese, 103=Meat, 107=Honey, 108=Pastirami, 110=Butter}
		
		hm1.put(null, "Nothing");
		System.out.println(hm1);//{null=Nothing, 100=Butter, 101=Orange, 102=Cheese, 103=Meat, 107=Honey, 108=Pastirami, 110=Butter}
		
		hm1.put(111, null);
		hm1.put(112, null);
		System.out.println(hm1);//{null=Nothing, 112=null, 100=Butter, 101=Orange, 102=Cheese, 103=Meat, 107=Honey, 108=Pastirami, 110=Butter, 111=null}

		System.out.println(hm1.get(101));//Orange
		System.out.println(hm1.get(200));//null
		
		/*
		 I want to get value if the key exists.
		 I want o get a message if the key does not exist
		*/
		System.out.println(hm1.getOrDefault(101, "The product you are looking for does not exist"));//Orange
		System.out.println(hm1.getOrDefault(200, "The product you are looking for does not exist"));//The product you are looking for does not exist
		
		System.out.println(hm1.values());//[Nothing, null, Butter, Orange, Cheese, Meat, Honey, Pastirami, Butter, null]
		System.out.println(hm1.keySet());//[null, 112, 100, 101, 102, 103, 107, 108, 110, 111]
		
		System.out.println(hm1.containsValue("Orange"));//true
		System.out.println(hm1.containsKey(200));//false
		
		hm1.putIfAbsent(200, "AAA");
		System.out.println(hm1);//{null=Nothing, 112=null, 100=Butter, 101=Orange, 102=Cheese, 103=Meat, 200=AAA, 107=Honey, 108=Pastirami, 110=Butter, 111=null}
		hm1.putIfAbsent(100, "ZZZ");
		System.out.println(hm1);//{null=Nothing, 112=null, 100=Butter, 101=Orange, 102=Cheese, 103=Meat, 200=AAA, 107=Honey, 108=Pastirami, 110=Butter, 111=null}
		
		System.out.println(hm1.remove(112));//null
		System.out.println(hm1);//{null=Nothing, 100=Butter, 101=Orange, 102=Cheese, 103=Meat, 200=AAA, 107=Honey, 108=Pastirami, 110=Butter, 111=null}
		System.out.println(hm1.remove(102, "Cheese"));
		System.out.println(hm1);//{null=Nothing, 100=Butter, 101=Orange, 103=Meat, 200=AAA, 107=Honey, 108=Pastirami, 110=Butter, 111=null}

		hm1.replace(103, "Olive");
		System.out.println(hm1);
		System.out.println(hm1.replace(211,"YYY"));//null
		System.out.println(hm1);
		/*
		 Instead of replace() method do not use put(), because put() adds new element if the key does not exist.
		 But replace() does not add anything if the key does not exist.
		*/
		hm1.replace(110, "Butter", "Jam");
		System.out.println(hm1);//{null=Nothing, 100=Butter, 101=Orange, 103=Olive, 200=AAA, 107=Honey, 108=Pastirami, 110=Jam, 111=null}

		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(301, "A");
		hm2.put(302, "B");
		
		hm1.putAll(hm2);
		System.out.println(hm1);//{null=Nothing, 100=Butter, 101=Orange, 103=Olive, 200=AAA, 107=Honey, 108=Pastirami, 301=A, 110=Jam, 302=B, 111=null}

	}

}
