package exception;

public class ThrowsEx {

	// main throws ClassNotFoundException �� ���������� ���������� ���� �ʴ´�
	// ���α׷� ������ �߻��� ���ܴ� ���α׷� ������ �ذ�
	
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Exception �߻�");
		}
	}

	public static void findClass() throws ClassNotFoundException {
		
//		try {
//			// clazz�� String �޼ҵ� �ҷ�����
//			Class clazz = Class.forName("java.lang.String");
//			System.out.println("�̻� ����");
//		} catch (Exception e) {
//			System.out.println("Exception �߻�");
//		}
		
		Class clazz = Class.forName("java.lang.String");
	}

}
