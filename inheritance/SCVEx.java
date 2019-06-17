package inheritance;

class SCV extends Unit{
	
	void mine(int x, int y) {
		super.move(x, y);
		super.stop();
		System.out.println("자원을 채취합니다");
	}
	
	void attack(SCV scv) {
		scv.hp -= 10;
		if (scv.hp <= 0) {
			scv.hp = 0;
			System.out.println("SCV가 파괴되었습니다");
		}
		System.out.println("공격하고 있습니다");
	}
	
	void fix(SCV scv) {
		scv.hp += 5;
		if (scv.hp > 30)
			scv.hp = 30;
		System.out.println("고치고 있습니다");
	}
	
	// override = 덮어쓰기 != overload
	@Override // 어노테이션: 안적어도 되나 관례적으로 Override는 다 적는다.
	void stop() {
		System.out.println("SCV가 멈춥니다");
	}
}

public class SCVEx {
	public static void main(String[] args) {
		
		SCV scv1 = new SCV();
		SCV scv2 = new SCV();
		
		scv1.move(1, 0);
		scv1.stop();
		scv1.mine(3, 2);

		System.out.println("scv2 hp: " + scv2.hp);
		scv1.attack(scv2);
		System.out.println("scv2 hp: " + scv2.hp);
		scv1.fix(scv2);
		System.out.println("scv2 hp: " + scv2.hp);
	}
}