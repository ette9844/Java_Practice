package classLecture;

public class PrinterEx {

	// ���� ����
	static int a = 10;
	// ���� ���: ������ �ȵ�(final)
	// ����� ���������� �빮�ڷ� ����
	static final int B = 10;
	
	public static void main(String[] args) {
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("ȫ�浿");
		
		a = 20;
		// B = 30; -> error
		
		// ����� ���
		System.out.println(Math.PI);
		System.out.println(B);
		System.out.println(Printer.AA);

	}

}
