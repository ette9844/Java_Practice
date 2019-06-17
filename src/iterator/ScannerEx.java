package iterator;

// java.lang 패키지는 import하지 않아도 사용 가능 -> 기본적으로 포함되어있음
// scanner 패키지를 가지고 와야 Scanner 객체/메서드 사용 가능 (외부API)
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		// 키보드로 받은 정보를 inputString에 저장
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		
		System.out.println(">>" + inputString);
		
		scanner.close();
	}

}
