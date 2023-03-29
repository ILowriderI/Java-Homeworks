package port;

public class Ship implements Runnable {
	private int box ;
	private String name;

	
	public Ship(int box, String name) {
		super();
		this.box = box;
		this.name = name;
	}
	

	public int getBox() {
		return box;
	}


	public void setBox(int box) {
		this.box = box;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void run() {
		System.out.println( name  +" ship started unloading");
		int count = 0;
		for (int i = 1; i < box+1; i++) {
			System.out.println("unloaded " + i + "  boxes from " + name);
			count++;
			try {
				Thread.currentThread().sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (box == count) {
			System.out.println(name + " ship unloaded");
		}
	}


	@Override
	public String toString() {
		return "Ship [box=" + box + ", name=" + name + "]";
	}
	

}