package inheritance;

class SCV extends Unit{
	
	void mine(int x, int y) {
		super.move(x, y);
		super.stop();
		System.out.println("�ڿ��� ä���մϴ�");
	}
	
	void attack(SCV scv) {
		scv.hp -= 10;
		if (scv.hp <= 0) {
			scv.hp = 0;
			System.out.println("SCV�� �ı��Ǿ����ϴ�");
		}
		System.out.println("�����ϰ� �ֽ��ϴ�");
	}
	
	void fix(SCV scv) {
		scv.hp += 5;
		if (scv.hp > 30)
			scv.hp = 30;
		System.out.println("��ġ�� �ֽ��ϴ�");
	}
	
	// override = ����� != overload
	@Override // ������̼�: ����� �ǳ� ���������� Override�� �� ���´�.
	void stop() {
		System.out.println("SCV�� ����ϴ�");
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