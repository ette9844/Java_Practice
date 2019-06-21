package generic.method;

public class CompareMethodEx {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<>(1, "���");
		Pair<Integer, String> p2 = new Pair<>(1, "������");
		
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		if (result1 == true) {
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
		
		Pair<String, String> p3 = new Pair<>("user1","hong");
		Pair<String, String> p4 = new Pair<>("user1","hong");
		
		boolean result2 = Util.compare(p3, p4);
		if (result1 == true) {
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
		
		int result3 = Util.compare(10, 20);
		if(result3 == 0)
			System.out.println("�����ϴ�");
		else if(result3 > 0)
			System.out.println("���� ���� �� Ů�ϴ�");
		else
			System.out.println("�ڿ� ���� �� Ů�ϴ�");
		

		// ���ڰ� �����Բ� �����߱� ������ ���ڿ��� �Է��ϸ� ������ ����
//		int result4 = Util.compare("10", "20");
	}

}
