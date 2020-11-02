package day28interface;

public class Runner {

	public static void main(String[] args) {
		
		Honda c1 = new Honda();
		c1.move();
		c1.gas();
		c1.seat();
		c1.steeringWheel();
		c1.radio();
		c1.tire();
		c1.hood();
		c1.headLight();
		c1.color();
		c1.windowtint();
		c1.clean();
		
		
		/*
		 If you use "default" keyword to create 
		 concrete methods in an interface you can access them
		 just by using objects. 
		 But if you use "static" keyword to
		 create concrete methods in an interface you can access
		 them just by using "interface name"
		*/
		c1.polish();
		Outside.sunroof();
		/*
		 All variables are static in interfaces, because of that
		 we use "interface names" to access them. If you use 
		 object to access variables in an interface, Java will give you
		 any one of them. To make sur to select a specific variable
		 you have to use interface names.
		*/
		System.out.println(Outside.PRICE);//30000
		System.out.println(Inside.PRICE);//20000
		
		/*
		 For unique variables, if you use object to access
		 the variable, it works. But it is not recommended because
		 we prefer to access static class members "class names"
		 or "interface names"
		*/
		System.out.println(c1.NUM);//12 ==> Not recommended
		System.out.println(Outside.NUM);//12 ==> Recommended

	}
}
