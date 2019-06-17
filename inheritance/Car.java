package inheritance;

public class Car {
	
	String master = "kim";
	String model = "Sonata";
	String color;
	
	int speed;
	int cc;
	int maxSpeed;
	
	// Overriding
	Car() {
		System.out.println("Car()");
	}
	
	Car(String master) {
		this.master = master;
		this.cc = 2000;
		this.maxSpeed = 200;
		
		System.out.println("Car(String master)");
	}
	
	Car(String master, int cc) {
		this(master);
		this.cc = cc;
		
		System.out.println("Car(String master, int cc)");
	}
	
	void run() {
		System.out.println("run");
		speed = speed + 10;
	}
}
