package classLecture;

// �� ���ϴ� ���� Ŭ������ �ִ� ���� ���� ����� �ƴϴ� (ã�� �����)
// ��ü���� ���α׷����� ��ġ�� ��� static

// class �տ� public�� �ٴ°��� java���ϴ� ������ �ϳ�
// public�� �ٴ� Ŭ������ ���ϸ�� �����ؾ���

// p236
// static���� ���� ��� �ڵ尡 ���� RAM�� �ö� ���� -> �ٷ� �۵�
class AboutClass {

	// ���� �ʵ�
	static int value = 10;

	static {
		// static�� ����ϸ� �ʵ忡���� �� ���� ����
		value = 20;
	}

	public static void main(String args[]) {
		// static���� RAM�� �̸� �÷����� ������ ��ü�� ���� �ʿ���� ���̷�Ʈ�� ��� ����
		println(20);
		println(value);
		
		// Ŭ���� ��ü�� ����������� �ʾƵ� ���� ����
		System.out.println(Claass.d);
	}

	// ���� �޼ҵ�
	public static void println(int a) {
		System.out.println(a);
	}
}

class Claass {

	// �Ϲ� Ŭ���������� �ʵ忡�� ���� ������ �� ����
	int a = 10;
	int b = 10;
	int c = 0;

	// c = a + b; -> ����
	
	static int d = 22;
	
	static {
		d = 33;
	}

}
