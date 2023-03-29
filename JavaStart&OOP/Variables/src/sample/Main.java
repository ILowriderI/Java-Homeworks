package sample;

public class Main {

	public static void main(String[] args) {
		
		/*    Площадь треугольника       */
	double sideA = 0.3,
		   sideB = 0.4,
		   sideC = 0.5,
	       semiPerTr = (sideA + sideB + sideC) / 2,
	       areaTr = Math.sqrt(semiPerTr * (semiPerTr - sideA) * (semiPerTr - sideB) * (semiPerTr - sideC));
	
	System.out.println("Area of triangle : " + areaTr);
	
	/*    Стоимость яблок        */
	int applePrice = 2,
	    amount = 6;
	System.out.println("Total cost of apples : " +(applePrice * amount));
	
	/*    Стоимость поездки         */
	double petrolPrice = 1.2 ,
		   petrolCons = 8,
		   kmAmount = 120,
		   kmCost = petrolCons * petrolPrice / 100 ,
		   tripCost = kmAmount * kmCost;
	System.out.println("Total trip cost : " + tripCost + " $ ");
	   	
	}

}


 	

 


