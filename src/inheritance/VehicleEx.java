package inheritance;

class Vehicle {
	void run() {
		System.out.println("자동차 달립니다");
	}
}

class Bus extends Vehicle {
	void run() {
		System.out.println("버스 달립니다");
	}

	void price() {
		System.out.println("버스 요금을 받습니다");
	}
}

class Taxi extends Vehicle {
	void run() {
		System.out.println("택시 달립니다");
	}

	void price() {
		System.out.println("택시 요금을 받습니다");
	}
}

class Driver {
	// 형변환을 이용해서 최상위 클래스 하나만 이용해서 메서드를 만듬
	void driver(Vehicle vehicle) {
		vehicle.run();
	}
}

public class VehicleEx {
	public static void main(String[] args) {
		Driver driver = new Driver();

		driver.driver(new Bus());
		driver.driver(new Taxi());
	}
}
