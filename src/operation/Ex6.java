package operation;

public class Ex6 {
	public static void main (String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = ((lengthTop + lengthBottom) * height) / 2;
		System.out.println(area);
		
		// 유효숫자가 4자리 라면? - 소숫점 둘째자리까지
		area = ((lengthTop + lengthBottom)*height) * 100 / (double) 200;
		System.out.println(area);
	}
}
