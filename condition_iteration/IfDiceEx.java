package condition_iteration;

public class IfDiceEx {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;	
		// random() 리턴값: 0.0부터 1.0사이의 실수값
		// int 형변환으로 소숫점 이하 버림
		
		if (num == 1) {
			System.out.println("1번이 나왔습니다");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다");
		} else {
			System.out.println("6번이 나왔습니다");
		}
	}
}
