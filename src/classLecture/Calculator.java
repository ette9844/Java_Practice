package classLecture;

public class Calculator {
	
	// ������
	Calculator() {
		
	}
	
	// ������ �����ε�
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
	// �Ű������� Ÿ�԰� ��ġ, ������ �Լ��� ������
	double div(int a, double b) {
		return a+b;
	}
	
	double div(double a, int b) {
		return a+b;
	}
	
//	int div(int a, double b) {
//		// �����ε� �Ұ�
//		return a+b;
//	}
}
