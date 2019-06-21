package generic;

public class BoxEx {
	public static void main(String[] args) {
		
		// ���赵������ ���� Ÿ������ �������� �ʾƵ� ������ main������ ������ heap�� �ö󰡹Ƿ�
		// Ÿ���� ����������
		Box<String> box1 = new Box<String>();	// T <= String
//		Box<VV> box2 = new Box<VV>();			// T <= VV
		
		box1.set("Hello");
		String str = box1.get();
		System.out.println(str);
		
		// ������ Ÿ�� ���� Ÿ���� ������ �ٷ� ����
//		box1.set(23);
		
		// Object�� �����صθ� �� ��� ����
		Box2 box2 = new Box2();
		box2.set("Hello");
		box2.set(12345);
		box2.set(3.04);
		
		// generic�� ����: ���� ���� �� ���� Ÿ��üũ�� �Ѵ�
		Box<Integer> box3 = new Box<>();
		box3.set(6);
		int value = box3.get();
		System.out.println(value);
		
	}
}

class VV {}