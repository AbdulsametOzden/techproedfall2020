package day20stringbuilderdt;

public class Sb01 {
	
	/*
	 1)String class is immutable, sometimes we need mutable Strings but String class cannot provide
	   mutable Strings. Because of that Java created another class which is "StringBuilder" Class.
	   When you create a String by using StringBuilder it will be mutable.
	 2)StringBuilder does not have "synchronization" feature. To be able to do synchronization Java 
	   uses "StringBuffer" class. StringBuilder and StringBuffer have almost same methods. The difference is 
	   in "scynchronization" and "speed". StringBuilder is faster than StringBuffer.  
	 */

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String str1 = "Java";
		concat(str1);
		//Java uses pass by value and Strings are immutable , because of that we get "Java" as output.
		System.out.println(str1);
		
		//How to create StringBuilder
		//1.Way:
		StringBuilder sb1 = new StringBuilder();//You created an empty String
		System.out.println(sb1.capacity());//16
		
		//How to add String to a StringBuilder
		sb1.append("Animal");
		System.out.println(sb1);//Animal
		System.out.println("Before trim : " + sb1.capacity());//16
		sb1.trimToSize();//trimToSize() removes the unused reserved area.
		System.out.println("After trim: " + sb1.capacity());//6
		
		sb1.append("X");
		System.out.println(sb1);//AnimalX
		sb1.append("Y").append("ZZZZZZZZZZZZZZZZ");
		System.out.println(sb1);//AnimalXYZ
		System.out.println(sb1.capacity());//34 ==> 16 * 2 + 2 = 34
		
		
		//2.Way:
		StringBuilder sb2 = new StringBuilder(10);//You want to create a StringBuilder, 
		                                          //its "capacity" will be 10 characters
		sb2.append("People");
		System.out.println(sb2);//People
		sb2.append("XYZTU");
		System.out.println(sb2);//PeopleXYZTU
		
		
		
		//3.Way:
		StringBuilder sb3 = new StringBuilder("Learn Java!");//If you are sure about the String content
		                                                     //use 3. way
		System.out.println(sb3);//Learn Java!
		sb3.append("X");
		System.out.println(sb3);//Learn Java!X
		
		//How can I get the number of characters in a StringBuilder
		StringBuilder sb4 = new StringBuilder("Sleep less, life is short");
		
		//1.Way
		//sb4.trimToSize(); ==>Before capacity() method if you use trimToSize() you can get the
		//                     number of characters, but not recommended
		System.out.println(sb4.capacity());//41
		
		//2.Way ==>Recommended
		System.out.println(sb4.length());//25
		
		//How to delete multiple characters from a StringBuilder
		//Starting index is inclusive, ending index is exclusive
		sb4.delete(10, sb4.length());
		System.out.println(sb4);//Sleep less
		
		//How to delete a character at a specific index
		sb4.deleteCharAt(sb4.length()-1);
		System.out.println(sb4);//Sleep les
		
		//How to get a part of StringBuilder
		System.out.println(sb4.substring(0, 5));//Sleep
		System.out.println(sb4);//Sleep les

		//How to get index of a specific character
		System.out.println(sb4.indexOf("p"));//4
		System.out.println(sb4.indexOf("e"));//2
		System.out.println(sb4.indexOf("ep"));//3
		
		//How to get a character at specified index
		System.out.println(sb4.charAt(0));//S
		
		//How to add character/s to a specified index
		sb4.insert(5, "X").insert(sb4.length()-1, "s");
		System.out.println(sb4);//SleepX less
		
		//How to reverse String
		sb4.reverse();
		System.out.println(sb4);//ssel XpeelS
		
		//How to convert StringBuilder to String
		//toString() is returning String because of that it cannot update the StringBuilder.
		//If you want to use StringBuilder as a String use method chain.
		sb4.toString();

	}
	
	public static String concat(String str) {
		return str + "X";
	}

}
