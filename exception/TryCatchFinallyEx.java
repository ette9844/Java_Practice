package exception;

// p449 6번
public class TryCatchFinallyEx {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		
		// run > run configurations > arguments > program arguments 에서 args[]를 설정해 줄 수 있다
		strArray[0] = args[0];
		strArray[1] = args[1];
		strArray[2] = args[2];
		
		int value = 0;

		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
				
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
				
			} finally {
				System.out.println(value + "\n");
			}
		}
	}
}
