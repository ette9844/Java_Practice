package exception;

public class ThrowsEx {

	// main throws ClassNotFoundException 도 가능하지만 관례적으로 하지 않는다
	// 프로그램 내에서 발생한 예외는 프로그램 내에서 해결
	
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Exception 발생");
		}
	}

	public static void findClass() throws ClassNotFoundException {
		
//		try {
//			// clazz에 String 메소드 불러오기
//			Class clazz = Class.forName("java.lang.String");
//			System.out.println("이상 없음");
//		} catch (Exception e) {
//			System.out.println("Exception 발생");
//		}
		
		Class clazz = Class.forName("java.lang.String");
	}

}
