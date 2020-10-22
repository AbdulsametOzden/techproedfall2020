package day25exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E01 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/day25exceptions/TextFil");
		
		int k;
		
		while((k = fis.read()) != -1) {
			System.out.print((char)k);
		}

		fis.close();
	}

}
