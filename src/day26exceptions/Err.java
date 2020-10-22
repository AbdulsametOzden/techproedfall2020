package day26exceptions;

public class Err {
	/*
	 1)When we get Exception, we can handle them by throwing exceptions or using try-catch block.
	   But when we get "Error" we can do nothing. Exceptions can be handled but Errors cannot.
	 2)Common Errors are a)"Out Of Memory Error": It occurs when the Heap Memory is full for any reason.
	                     b)"StackOverflowError": It occurs when the Stack Memory is full for any reason. 
	*/
	
	/*
	 We learned a)final ==> final variable: Value cannot be changed, must be initialized, use uppercases
	                        final method: Cannot be overridden
	                        final class: Cannot be extended 
	            b)finally ==> It is used in try-catch block and it runs everytime 
	            c)finalize ==> Garbage Collector scans the memory constantly. If there is something 
	                           to remove Java "finalizes" it first then remove it from the memory.
	                           finalize is a method, you can call the finalize() if you need but Java 
	                           runs it whenever it wants.             
	 */
}
