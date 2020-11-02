package day31collectionsdt;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
	/*
	 1) Deque means Double Ended Queue.
	    In Queue's we can use just FIFO, but in Deque FIFO is used and LIFO is used as well
	    LIFO stands for "Last In First Out"
	 2) Deque is faster than LinkedList 
	 3) Deque does not accept null as element  
	*/

	public static void main(String[] args) {
		
		Deque<String> dq1 = new LinkedList<>();
		dq1.add("Ali");
		dq1.add("Mary");
		dq1.add("Can");
		dq1.add("Angie");
		dq1.add("Kasim");
		System.out.println(dq1);//[Ali, Mary, Can, Angie, Kasim]

	}

}
