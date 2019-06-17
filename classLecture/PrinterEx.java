package classLecture;

public class PrinterEx {

	// 정적 변수
	static int a = 10;
	// 정적 상수: 변경이 안됨(final)
	// 상수는 관례적으로 대문자로 쓴다
	static final int B = 10;
	
	public static void main(String[] args) {
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		
		a = 20;
		// B = 30; -> error
		
		// 상수값 사용
		System.out.println(Math.PI);
		System.out.println(B);
		System.out.println(Printer.AA);

	}

}
