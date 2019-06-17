package inheritance;

class Vehicle {
	void run() {
		System.out.println("�ڵ��� �޸��ϴ�");
	}
}

class Bus extends Vehicle {
	void run() {
		System.out.println("���� �޸��ϴ�");
	}

	void price() {
		System.out.println("���� ����� �޽��ϴ�");
	}
}

class Taxi extends Vehicle {
	void run() {
		System.out.println("�ý� �޸��ϴ�");
	}

	void price() {
		System.out.println("�ý� ����� �޽��ϴ�");
	}
}

class Driver {
	// ����ȯ�� �̿��ؼ� �ֻ��� Ŭ���� �ϳ��� �̿��ؼ� �޼��带 ����
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
