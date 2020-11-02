package day30collectionsdt;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {

		//How to create a LinkedList
		LinkedList<String> ll1 = new LinkedList<>();
		
		//How to add elements
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Mary");
		ll1.add("Angie");
		ll1.add("Tom");
		
		//How to print Linkedlist
		System.out.println(ll1);//[Ali, Veli, Mary, Angie, Tom]
		
		ll1.add(1, "Alex");
		System.out.println(ll1);//[Ali, Alex, Veli, Mary, Angie, Tom]
		
		ll1.addFirst("AAA");
		System.out.println(ll1);//[AAA, Ali, Alex, Veli, Mary, Angie, Tom]
		
		ll1.addLast("ZZZ");
		System.out.println(ll1);//[AAA, Ali, Alex, Veli, Mary, Angie, Tom, ZZZ]
		
		//LinkedList<String> ll2 = new LinkedList<>();
		ArrayList<String> ll2 = new ArrayList<>();
		ll2.add("AAA");
		ll2.add("Alex");
		ll2.add("ZZZ");
		ll2.add("Alex");
		
		ll1.addAll(ll2);
		System.out.println(ll1);//[AAA, Ali, Alex, Veli, Mary, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]
		
		ll1.addAll(3, ll2);
		System.out.println(ll1);//[AAA, Ali, Alex, AAA, Alex, ZZZ, Alex, Veli, Mary, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]
		
		//remove() methods...
		
		//1)remove() method removes the first element. remove() returns the removed element
		System.out.println(ll1.remove());
		System.out.println(ll1);//[Ali, Alex, AAA, Alex, ZZZ, Alex, Veli, Mary, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]
		
		//2)remove(6) method removes the element at index 6. remove(6) method returns the removed element which is Veli 
		System.out.println(ll1.remove(6));
		System.out.println(ll1);//[Ali, Alex, AAA, Alex, ZZZ, Alex, Mary, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]
		
		//3)remove("Alex") removes the first "Alex" from the list. remove("Alex") returns boolean. If the element
		//  exists and is removed you will get "true" otherwise you will get "false"
		System.out.println(ll1.remove("Alex"));//true
		System.out.println(ll1);//[Ali, AAA, Alex, ZZZ, Alex, Mary, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]
		
		System.out.println(ll1.remove("MMM"));//false
		System.out.println(ll1);//[Ali, AAA, Alex, ZZZ, Alex, Mary, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]
		
		//Check if Alex exists in the LinkedList.
		//If it exists remove it otherwise provide me a message like "He does  not exist"
		if(ll1.remove("Alexa")) {
			System.out.println("Alexa exists and he is removed");
		}else {
			System.out.println("Alexa does not exist");
		}
		
		//4)removeFirst() method removes the first element. removeFirst() returns the removed element
		System.out.println(ll1.removeFirst());
		System.out.println(ll1);//[AAA, Alex, ZZZ, Alex, Mary, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]
		
		//5)removeLast() method removes the last element. removeLast() returns the removed element
		System.out.println(ll1.removeLast());
		System.out.println(ll1);//[AAA, Alex, ZZZ, Alex, Mary, Angie, Tom, ZZZ, AAA, Alex, ZZZ]
		
		//6)removeFirstOccurrence("Alex") removes the first occurence of Alex.
		//removeFirstOccurrence() returns boolean.
		System.out.println(ll1.removeFirstOccurrence("Alex"));
		System.out.println(ll1);//[AAA, ZZZ, Alex, Mary, Angie, Tom, ZZZ, AAA, Alex, ZZZ]
		
		//7)removeLastOccurrence("ZZZ") removes the last occurence of ZZZ
		//  removeLastOccurrence() returns boolean.
		ll1.removeLastOccurrence("ZZZ");
		System.out.println(ll1);//[AAA, ZZZ, Alex, Mary, Angie, Tom, ZZZ, AAA, Alex]
		
		//8)removeAll(ll3) removes all elements which are in ll3 form ll1.
		//  removeAll() returns boolean
		//  removeAll() returns false if no element is removed. It returns true if at least
		//  one element is removed.
		LinkedList<String> ll3 = new LinkedList<>();
 		ll3.add("Alex");
 		ll3.add("Angie");
 		ll3.add("NNNN");
 		
 		System.out.println(ll1.removeAll(ll3));//boolean ==> true
		System.out.println(ll1);//[AAA, ZZZ, Mary, Tom, ZZZ, AAA]
	}
}