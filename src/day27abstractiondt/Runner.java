package day27abstractiondt;

public class Runner {

	public static void main(String[] args) {
		
		Crv car1 = new Crv();
		car1.ac();
		car1.engine();
		car1.leather();
		
		Civic car2 = new Civic();
		car2.ac();
		car2.engine();
		car2.leather();

	}

}
