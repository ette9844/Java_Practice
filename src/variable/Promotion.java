package variable;

public class Promotion {
	public static void main (String [] args) {
		// 타입 변경
		int a = 10;
		int b = 20;
		
		double dbA = 20;
		double dbB = 0;
		
		dbB = dbA + a;	// 자동으로 형 변환을 해줌
		dbB = dbA + (double) a;		// 명시적으로 형 변환
		// 20.0 + 10.0
		System.out.println(dbB);
		
		b = (int) dbB;	// double에서 int형으로 형 변환
		System.out.println(b);
		// 강제 타입 형 변환은 되도록 피하는 것이 좋다
		// 쓴다면 한번 쓰고 다시 되돌려놓도록 한다
		
		//sysout 쓰고 ctrl+스페이스바 누르면 자동완성으로 println()이 완성됨
		System.out.println("sysout + ctrl + space");
	}
}
