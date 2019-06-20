package homework7_interface;

public interface Flyer {

	int fast = 100;
	void fly();
	boolean isAnimal();
}

class Bird implements Flyer {

	@Override
	public void fly() {
		System.out.println("Bird flying");
	}

	@Override
	public boolean isAnimal() {
		System.out.println("true");
		return true;
	}
}

class Airplane implements Flyer {

	@Override
	public void fly() {
		System.out.println("Airplane flying");
	}

	@Override
	public boolean isAnimal() {
		System.out.println("false");
		return false;
	}
}

interface FlyerUtil extends Flyer {
	
	// ��ü�� fly()�� isAnimal() ȣ��
	static void show(Flyer b) {
		b.fly();
		b.isAnimal();
	}
}