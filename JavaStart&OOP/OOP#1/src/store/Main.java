package store;

public class Main {

	public static void main(String[] args) {
		Product beef = new Product("beef",1,10);
		Product cheese = new Product("cheese",2,12);
		Product beer = new Product("beer",4,5);
		
		System.out.println(beef.toString());
		System.out.println(cheese.toString());
		System.out.println(beer.toString());
	}

}
