package day21encapsulationinheritance;

public class Encapsulation02 {

	public static void main(String[] args) {
		
		Encapsulation01 obj1 = new Encapsulation01();	
		System.out.println(obj1.getCollegeName());//FIU
		obj1.setCollegeName("UNF");
		System.out.println(obj1.getCollegeName()); // ==> UNF
		
		Students std1 = new Students();
		System.out.println(std1.getAddress());//Miami, Florida
		System.out.println(std1.getName());//Ali Can
		System.out.println(std1.getSsn());//*****6789
		
		//Create a new student whose address is "Piscataway, NewJersey", and name is "Ayse Tan", and
		//SSN is 987654321. Print the data on the console.
		Students std2 = new Students();
		std2.setAddress("Piscataway, NewJersey");
		System.out.println(std2.getAddress());
	    std2.setName("Ayse Tan");
		System.out.println(std2.getName());
		std2.setSsn("987654321");
		System.out.println(std2.getSsn());

	}

}
