package iterator;

import java.util.Scanner;

public class GBB {

	public static void main(String[] args) {

		String comStr = null;
		String myStr = null;
		String resultSTr = null;
		
		int com = (int) (Math.random() * 3); // 0 1 2 ���� ���� ��

		switch (com) {
		case 0:
			comStr = "����";
			break;
		case 1:
			comStr = "����";
			break;
		case 2:
			comStr = "��";
			break;
		}

		// ��ĳ�ʷ� int�� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int my = sc.nextInt();
		switch (my) {
		case 0:
			myStr = "����";
			break;
		case 1:
			myStr = "����";
			break;
		case 2:
			myStr = "��";
			break;
		}

		System.out.println("com = " + com + " : " + comStr);
		System.out.println("my  = " + my + " : " + myStr);

		int result = (my - com + 2) % 3; // 2 draw 1 com 0 my
		switch (result) {
		case 0:
			resultSTr = "my �̰���ϴ�.";
			break;
		case 1:
			resultSTr = "com �̰���ϴ�.";
			break;
		case 2:
			resultSTr = "�����ϴ�.";
			break;
		}

		System.out.println("result = " + result + " : " + resultSTr);

	}
}
