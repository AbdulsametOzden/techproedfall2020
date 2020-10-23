package projectvendingmachinent;

public class Runner {

public static void main(String[] args) {
	
		System.out.println("Hi, Welcome to our shop...");	
	
		Products product = new Products();
		Methods method = new Methods();
	    double accountBalance = 0;
		
		accountBalance = method.getMoney(accountBalance);
	
        product.setPrice(method.select(product));
        accountBalance = method.balance(product.getPrice(), accountBalance, product);
        method.purchase(product.getPrice(), accountBalance, product);
		
	}

}
