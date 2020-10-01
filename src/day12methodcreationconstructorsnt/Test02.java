package day12methodcreationconstructorsnt;

public class Test02 {

	public Test02() {
		System.out.println("Good");
	}
    public Test02(int i, int k) {
    	this(7);
		System.out.println("Ugly");
	}
    public Test02(int i) {
    	this();
		System.out.println("Bad");
	}
	
	public static void main(String[] args) {
		Test02 obj = new Test02(3,5);

	}
}
