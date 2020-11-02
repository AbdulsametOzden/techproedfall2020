package day29iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class I01 {
	
	/*
	 We have 2 interfaces; 1)Iterator: We can navigate inside a collection by using Iterator interface
	                                   We can access elements of the collection by using Iterator interface
	                                   We can remove elements from the collection by using Iterator interface
	                       2)ListIterator: ListIterator has more functionality than iterator.
	                                       You can navigate inside the collection in 2 directions.
	                                       By using hasNext() and next(), you can navigate from beginning to end 
	                                       By using hasPrevious() and previous(), you can navigate from end to beginning
	                                       Note: Before using hasPrevious() and previous(), you need to use
	                                             hasNext() and next()                     
	*/
	
	/*
	 Differences between "iterator" and "listiterator"
	 1)ListIterator can travers forward and backward, iterator can traverse just forward
	 2)ListIterator has hasNext(), next(), hasPrevious(), previous(), set(), add(), and remove()
	   Iterator has (just) remove() 
	 3)ListIterator can be used just for Lists
	   Iterator can be used for other collections(Maps, Sets, Lists) as well 
	 4)ListIterator has some methods to use indexes, but iterator cannot run with indexes 
	*/
	
	/*
	 By using loops we cannot update the collections, but sometimes we need to update collections.
	 To update collections we need to use iterators. 
	*/

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("C");
		list1.add("B");
		
		//Navigate among the elements by using for-each loop
		for(String w:list1) {
			w = w + "X";
		}
		System.out.println(list1);//[A, C, B]
		
		//Navigate among the elements by using iterator
		Iterator<String> it1 = list1.iterator();
		/*
		 hasNext() asks to the pointer if there is any element after the pointer. If there is 
		           it return "true", if there is no element it returns "false"
		 next() moves the pointer in front of the next element and returns the previous element          
		*/
		while(it1.hasNext()) {		
			it1.next();	
			it1.remove();
		}
		System.out.println(list1);//[]

	}
	   
}

