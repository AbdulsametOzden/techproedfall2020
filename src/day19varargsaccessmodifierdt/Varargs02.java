package day19varargsaccessmodifierdt;

public class Varargs02 {

	public static void main(String[] args) {
		
		concat("S", "k");//0
		concat("S", "t", "u");//1
	}
	
	public static void concat(String s, String m, String... t) {		
		System.out.println(t.length);	
	}

}
