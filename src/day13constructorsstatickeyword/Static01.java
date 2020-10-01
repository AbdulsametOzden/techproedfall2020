package day13constructorsstatickeyword;

public class Static01 {
	
	/*
	 1)If you use static keyword for an instance variable, then it is called "class variable"
	   "age" is "instance(object) variable", "height" is class variable
	   
	 2)You can access "static" things by using just class name.
	   But to access "instance" things you have to create object.
	   Note:If you want you can access to static ones by using
	        objects as well but it is not recommended  
	 */
	int age = 23;
	static int height = 6;

	public static void main(String[] args) {
		
		System.out.println(Static01.height);//6
		
		Static01 obj1 = new Static01();
		System.out.println(obj1.age);//23
		
		//Accessing static things by using object is not recommended
		System.out.println(obj1.height);

	}
	
	public static void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public void subtract(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
