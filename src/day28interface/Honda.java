package day28interface;

public class Honda extends Car implements Inside, Outside, Cosmetic{

	@Override
	public void move() {
		System.out.println("It moves successfully");		
	}
	@Override
	public void gas() {
		System.out.println("Uses gas economically");
	}
	@Override
	public void tire() {
		System.out.println("Unused tires");		
	}
	@Override
	public void hood() {
		System.out.println("Stainless steel");		
	}
	@Override
	public void headLight() {
		System.out.println("Led headlights");		
	}
	@Override
	public void seat() {
		System.out.println("Orthopedic seats");		
	}
	@Override
	public void steeringWheel() {
		System.out.println("Leather steering wheel");		
	}
	@Override
	public void radio() {
		System.out.println("Digital radio");	
	}
	@Override
	public void color() {
		System.out.println("Red");
		
	}
	@Override
	public void windowtint() {
		System.out.println("%80 dark");		
	}
	@Override
	public void clean() {
		System.out.println("Keep clean");	
	}

}
