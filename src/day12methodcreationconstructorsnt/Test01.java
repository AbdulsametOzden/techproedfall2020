package day12methodcreationconstructorsnt;

public class Test01 {

	public static void main(String[] args) {		
			add(3.2, 4.8);
			System.out.println(add(5, 7.3));
			System.out.println(add(5, 7));
			add(5.3, 7);
	}
	
	public static void add(double n1, double n2) {
		System.out.println(n1 + n2);
	}
	public static double add(int n1, double n2) {
		return n1 + n2;
	}
 	public static int add(int n1, int n2) {
		return n1 + n2;
	}

}
