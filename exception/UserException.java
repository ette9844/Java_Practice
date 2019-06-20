package exception;

// 사용자 정의 예외 클래스 선언
class MyException extends Exception {
	
	// 생성자
	public MyException() {}
	
	public MyException(String message) {
		super(message);
	}
}

public class UserException {

	public static void main(String[] args) {
		int data = 10;
		if(data == 10) {	// 예외처리 조건
			try {
				throw new MyException("데이터가 10 입니다");
				
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
	}
}