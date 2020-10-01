package day13constructorsstatickeyword;


public class Static02 {

	public static void main(String[] args) {
		
		Static01 obj1 = new Static01(); 
		System.out.println(obj1.age);//23
		obj1.subtract(11, 3);//8
		//You can access static things by using objects but it is not recommended
		//obj1.add(12, 11);//23
		
		System.out.println(Static01.height);
		Static01.add(4, 15);//19
		
		Static01 obj2 = new Static01();
		
		//Update static variables
		Static01.height++;
		System.out.println(obj1.height);
		System.out.println(obj2.height);
		
		//Update instance variables
		obj1.age++;
		System.out.println(obj1.age);//24
		
		System.out.println(obj2.age);//23

	}

}
