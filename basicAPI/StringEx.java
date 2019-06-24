package basicAPI;

public class StringEx {

	public static void main(String[] args) {

		// �⺻ �����϶��� �� �� �ִ� ��Ÿ���� String������ ����
		String str = "abc";

		// �⺻ ����
		char ch = 'c';
		int in = 10;

		// charAt: �ƽ�Ű�ڵ� �� (byte)�� ���ڿ��� ��ȯ
		byte[] bytes = { 72, 101, 108, 108, 111, 13, 10 }; // �ƽ�Ű �ڵ� ���� ��
		String str1 = new String(bytes);
		System.out.println(str1);

		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			System.out.print(c);
		}

		String str2 = "Monday";

		try {
			// getBytes: encoding
			byte[] str2Bytes = str2.getBytes("UTF-8");

			for (byte B : str2Bytes) {
				System.out.print(B + " ");
			}
			System.out.println();

			// decoding
			String str3 = new String(str2Bytes);
			System.out.println(str3);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// indexOf
		String str4 = "ABCDEFGHIJ";
		// ���ڿ��� �����ϴ� index�� ���� / �ش� ���ڿ��� ������ -1 ����
		int index = str4.indexOf("HIJ");
		System.out.println("index: " + index);

		// replace
		String str5 = "�ȳ��ϼ���. �ڹ��Դϴ�.";
		String str6 = str5.replace("�ڹ�", "JAVA");
		System.out.println(str6);

		// substring: �ֹε�Ϲ�ȣ���� ������� ��� �� ���
		String str7 = "880808-2008088";
		String year = str7.substring(0, 2);
		String gender = str7.substring(7, 8);

		gender = (gender.equals("1") ? "����" : "����");
		System.out.println("19" + year + "��� " + gender);

		// toLowreCase / toUpperCase: ��ҹ��� ��ȯ
		String str8 = "Hello Java";
		String lowercase = str8.toLowerCase();
		String uppercase = str8.toUpperCase();

		System.out.println(lowercase);
		System.out.println(uppercase);
		
		// valueOf
		String strInt = String.valueOf(100);
		String strBoolean = String.valueOf(true);
		String strDouble = String.valueOf(100.123);
		char[] charr = {'h', 'e', 'l', 'l', 'o'};
		String strCharArr = String.valueOf(charr);
		
		System.out.println(strInt);
		System.out.println(strBoolean);
		System.out.println(strDouble);
		System.out.println(strCharArr);
		
		System.out.println(Integer.valueOf(strInt));		
	}
}
