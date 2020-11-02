package day31collectionsnt;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	
	/*
	 Queue adds the elements to the end of the list, and removes the elements from the beginning.
	 FIFO ==> First In First Out
	*/

	public static void main(String[] args) {
	
		Queue<String> q1 = new LinkedList<>();
		q1.add("Ali");
		q1.add("Metin");
		q1.add("Joe");
		q1.add("Mary");
		q1.add("Angie");
		System.out.println(q1);//[Ali, Metin, Joe, Mary, Angie]
		
		//remove() returns the first element but removes it from the queue
		System.out.println(q1.remove());
		System.out.println(q1);//[Metin, Joe, Mary, Angie]
		
		//peek() returns the first element but it does not remove
		System.out.println(q1.peek());
		System.out.println(q1);//[Metin, Joe, Mary, Angie]
		
		//poll() returns the first element but removes it from the queue
		System.out.println(q1.poll());//Metin
		System.out.println(q1);//[Joe, Mary, Angie]
		
		/*
		 Note:If you use remove() for an empty queue, it returns "NoSuchElementException"
		      If you use poll() for an empty queue, it returns "null"
		*/
		
		//peek() returns the first element but it does not remove
		System.out.println(q1.element());
		System.out.println(q1);
		
		/*
		 Note:If you use element() for an empty queue, it returns "NoSuchElementException"
		      If you use peek() for an empty queue, it returns "null"
		*/
		
		Queue<String> q2 = new PriorityQueue<>();
		q2.add("Ali");
		q2.add("Metin");
		q2.add("Joe");
		q2.add("Mary");
		q2.add("Angie");
		System.out.println(q2);//[Ali, Angie, Joe, Metin, Mary]
	}

}
