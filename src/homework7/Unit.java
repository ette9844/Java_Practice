package homework7;

class Unit {

	protected int x, y; // ���� ��ġ

	void move(int x, int y) {
		// ������ ��ġ�� �̵�
		this.x = x;
		this.y = y;
		System.out.println("�̵� (" + x + ", " + y + ")");
	}

	void stop() {
		// ���� ��ġ�� ����
		System.out.println("���� (" + x + ", " + y + ")");
	}
}

// ����
class Marine extends Unit {	
	void stimPack() {
		// �������� ����Ѵ�
		System.out.println("������ ���");
	}
}

// ��ũ
class Tank extends Unit {
	void changeMode() {
		// ���ݸ��� ��ȯ�Ѵ�
		System.out.println("���ݸ��");
	}
}

// ���ۼ�
class Dropship extends Unit {
	void load() {
		// ���õ� ����� �¿��
		System.out.println("����� �¿�ϴ�");
	}
	
	void unload() {
		// ���õ� ����� ������
		System.out.println("����� �����ϴ�");
	}
}