package exception;

public class ThrowsEx2 {

	public static void main(String[] args) {

		findClass();

	}

	public static void findClass() {

		int data = 10;
		
		try {
			if(data == 10)	// ���� data�� 10�϶� ����ϴ�! -> Exception �߻���Ű��
				// ������ Exception �߻�
				throw new Exception();
			
		} catch (Exception e) {
			System.out.println("Exception �߻�");
		}

	}
}
