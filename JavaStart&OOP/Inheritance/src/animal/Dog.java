package animal;

public class Dog extends Animal {
private String name;

public Dog(String ration, String color, int weight, String name) {
	super(ration, color, weight);
	this.name = name;
}

public Dog() {
	super();
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String getVoice() {
	
	return getName() + " wow";
}
@Override
public void eat() {
	System.out.println(getName()+  "  eat " +getRation());
}

@Override
public void sleep() {
	
	System.out.println(getName()+" now sleep zzzzz");
}

@Override
public String toString() {
	return "Dog [name=" + name + super.toString()+ "]";
}



}
