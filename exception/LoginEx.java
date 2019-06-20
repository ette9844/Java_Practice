package exception;

// p449 7��
public class LoginEx {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login (String id, String password) throws Exception {
		
		// id�� "blue"�� �ƴ϶�� NotExistIDException �߻���Ŵ
		if(!id.equals("blue")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�");
		}
		
		// password�� "12345"�� �ƴ϶�� WrongPasswordException �߻���Ŵ
		if(!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�");
		}
	}
}

class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}

class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}