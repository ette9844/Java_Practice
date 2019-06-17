package iterator;

import java.util.Scanner;

public class GBB {

	public static void main(String[] args) {

		String comStr = null;
		String myStr = null;
		String resultSTr = null;
		
		int com = (int) (Math.random() * 3); // 0 1 2 가위 바위 보

		switch (com) {
		case 0:
			comStr = "가위";
			break;
		case 1:
			comStr = "바위";
			break;
		case 2:
			comStr = "보";
			break;
		}

		// 스캐너로 int값 입력받기
		Scanner sc = new Scanner(System.in);
		int my = sc.nextInt();
		switch (my) {
		case 0:
			myStr = "가위";
			break;
		case 1:
			myStr = "바위";
			break;
		case 2:
			myStr = "보";
			break;
		}

		System.out.println("com = " + com + " : " + comStr);
		System.out.println("my  = " + my + " : " + myStr);

		int result = (my - com + 2) % 3; // 2 draw 1 com 0 my
		switch (result) {
		case 0:
			resultSTr = "my 이겼습니다.";
			break;
		case 1:
			resultSTr = "com 이겼습니다.";
			break;
		case 2:
			resultSTr = "비겼습니다.";
			break;
		}

		System.out.println("result = " + result + " : " + resultSTr);

	}
}
