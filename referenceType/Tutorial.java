package referenceType;

public class Tutorial {

	public static void main(String[] args) {
		// stack�� �ڵ����� ��
		String str = "yeo";
		String str2 = "yeo"; // ���� ���� �����ϱ� ���ÿ� ���� �ּҰ��� ���� ��(heap�� �ϳ�)
		String str3 = new String("yeo"); // ���� ����� �־ �ٸ� �ּҰ��� ����� 
		// heap�� �� yeo ��ü�� ���� ��

		System.out.println(str == str2); // true
		System.out.println(str == str3); // false -> ==�� ���ÿ� ����� �ּҰ��� ���ϹǷ�

	}

}
