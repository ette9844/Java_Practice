package exception;

public class ThrowsEx2 {

	public static void main(String[] args) {

		findClass();

	}

	public static void findClass() {

		int data = 10;
		
		try {
			if(data == 10)	// 만약 data가 10일때 곤란하다! -> Exception 발생시키기
				// 강제로 Exception 발생
				throw new Exception();
			
		} catch (Exception e) {
			System.out.println("Exception 발생");
		}

	}
}
