package day16multidimensionalarrayslistsnt;

public class Test01 {
	
	public static void main(String[] args) {
		int[][] x = {{2, 1}, {1, 7, 1}};
		System.out.println(m(x[1]));
	}
	
	public static int m(int[] m) {
		int result = 0;
		for (int i = 0; i < m.length; i++)
		result += m[i];
		return result;
	}
}
