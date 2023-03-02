package animal;

public class Main {

	public static void main(String[] args) {
		Dog jango = new Dog("pork", "black", 4, "Jango");
		Cat migel = new Cat("rabbit", "gray", 3, "Migel");
		Veterinarian ignat = new Veterinarian("Ignat");
        migel.eat();
        jango.eat();
        migel.sleep();
        jango.sleep();
        System.out.println(migel.getVoice());
        System.out.println(jango.getVoice());
        System.out.println(jango.toString());
        System.out.println(migel.toString());
        System.out.println(ignat.toString());
        ignat.treatment(migel);
        ignat.treatment(jango);
        
        
	}

}
