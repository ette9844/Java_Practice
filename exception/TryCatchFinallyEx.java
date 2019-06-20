package exception;

// p449 6��
public class TryCatchFinallyEx {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		
		// run > run configurations > arguments > program arguments ���� args[]�� ������ �� �� �ִ�
		strArray[0] = args[0];
		strArray[1] = args[1];
		strArray[2] = args[2];
		
		int value = 0;

		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����");
				
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����");
				
			} finally {
				System.out.println(value + "\n");
			}
		}
	}
}
