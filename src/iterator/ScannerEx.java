package iterator;

// java.lang ��Ű���� import���� �ʾƵ� ��� ���� -> �⺻������ ���ԵǾ�����
// scanner ��Ű���� ������ �;� Scanner ��ü/�޼��� ��� ���� (�ܺ�API)
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		// Ű����� ���� ������ inputString�� ����
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		
		System.out.println(">>" + inputString);
		
		scanner.close();
	}

}
