package exception;

// ����� ���� ���� Ŭ���� ����
class MyException extends Exception {
	
	// ������
	public MyException() {}
	
	public MyException(String message) {
		super(message);
	}
}

public class UserException {

	public static void main(String[] args) {
		int data = 10;
		if(data == 10) {	// ����ó�� ����
			try {
				throw new MyException("�����Ͱ� 10 �Դϴ�");
				
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
	}
}