package classLecture;

public class Calculator {
	
	// 생성자
	Calculator() {
		
	}
	
	// 생성자 오버로딩
	Calculator(int a, int b) {
		
	}

	int add(int a, int b) {
		return a + b;
	}

	// add method overloading
	int add(int a, int b, int c) {
		return a + b + c;
	}

	double add(double a, double b) {
		return a + b;
	}

	double add(double a, double b, double c) {
		return a + b + c;
	}

	int minus(int a, int b) {
		return a - b;
	}

	int mux(int a, int b) {
		return a * b;
	}

	int div(int a, int b) {
		if (b == 0) {
			System.out.println("cannot divided by 0");
			return -1;
		}
		return a / b;
	}

	// div method overloading
	double div(double a, double b) {
		if (b == 0) {
			System.out.println("cannot divided by 0");
			return -1;
		}
		return a / b;		// a=10, b=3 -> 3.3333..
	}
	// 매개변수의 타입과 위치, 개수로 함수를 구분함
	double div(int a, double b) {
		return a+b;
	}
	
	double div(double a, int b) {
		return a+b;
	}
	
//	int div(int a, double b) {
//		// 오버로딩 불가
//		return a+b;
//	}
}
