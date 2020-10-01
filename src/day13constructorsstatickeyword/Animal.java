package day13constructorsstatickeyword;

public class Animal {
	
	int age;
	String name;
	int weight;
	boolean isCarnivorous;
	
	public Animal() {
		this("Cat", 25);//Constructor call must be in the first line every time
		this.age = 5;
		System.out.println("Age from the constructor without parameter: " + age);
	}
	
	public Animal(String name,int weight) {
		this(true);
		this.name = name;
		this.weight = weight;
		System.out.println("Name and weigth from the constructor with 2 parameters: " + name + " - " + weight);
	}
	
	public Animal(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
		System.out.println("Is the animal carnivorous: " + isCarnivorous);
	}
	
	public static void main(String[] args) {	
		
		Animal a2 = new Animal();

	}

}
