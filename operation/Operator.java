package operation;

// 사칙 연산자
public class Operator {
	public static void main (String[] args) {
		int b = 1;
		b = b + 1;
		b += 1;		// 대입 연산자
		b ++;		// 증감 연산자
		b--;
		
		// ex.1
		int num = 365;
		int p100;
		int p10;
		int p1;
		
		p100 = num / 100;
		p10	 = num % 100 / 10;
		p1   = num % 10;
		System.out.println("p100 = " + p100);
		System.out.println("p10  = " + p10);
		System.out.println("p1   = " + p1);
		
		// ex.2
		// F <- 현재 온도 20C
		double fer;
		double cel = 20;
		
		fer = (cel * 1.8) + 32;
		System.out.println("Celcius   = " + cel + "˚C");
		System.out.println("Ferenheit = " + fer + "˚F");
		
		System.out.println(9/5); 	// 주의: int로 형변환 되어서 1.8이 안나옴
		fer = cel*((9*1000)/5) + 32000; 	// 각각 1000 곱해서 계산하기
		System.out.println(fer/1000);  		// 1000을 나눔 -> 오차를 반올림 하지 않고 버림
		
		// 이렇듯 정확한 계산을 위해서는 정수로 계산을 해야한다
		// 실수 변수 계산은 어느시점에서 반올림을 하기 때문에 오차가 생긴다
	}
}
