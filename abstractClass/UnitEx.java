package abstractClass;

abstract class Unit {
	
	int x, y;
	int hp;
	void move(int x, int y) {};
	public abstract void stop();
	
}

class Marine extends Unit {
	
	int attacklevel;
	boolean mode;
	
	Marine() {
		hp = 100;
		attacklevel = 10;
		mode = false;
	}
	
	@Override
	public void stop() {
		System.out.println("Marine stop");
	}
	
	// abstract class도 다형성 이용 가능
	void attack(Unit enemy) {
		if(mode)
			enemy.hp -= attacklevel + 5;
		else
			enemy.hp -= attacklevel;
	}
	
	void stimPack() {
		mode = true;
		hp -= 10;
		System.out.println("스팀팩 사용");
	}
}

class Tank extends Unit {
	
	@Override
	public void stop() {
		System.out.println("Tank stop");
	}
}

class DropShip extends Unit {
	
	@Override
	public void stop() {
		System.out.println("Dropship stop");
	}
}

public class UnitEx {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		DropShip dropship = new DropShip();
		
		tank.stop();
		marine.stop();
		dropship.stop();
	}

}
