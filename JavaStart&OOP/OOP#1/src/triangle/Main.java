package triangle;

public class Main {

	public static void main(String[] args) {
		Triangle myTriangle = new Triangle(0.3,0.5,0.4);
		Triangle someTriangle = new Triangle(10,12,9);
		
		
		System.out.println(myTriangle.area());
		System.out.println(someTriangle.area());

	}

}
