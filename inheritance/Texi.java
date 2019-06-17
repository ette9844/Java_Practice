package inheritance;

public class Texi extends Car {
	
	int totalPrice = 0;
	int basicPrice = 3000;
	String master = "ahh";
	
	Texi() {
		// �������� ������ �θ�Ŭ������ �����ڰ� ȣ���
		// super();
		// super("yeo");		// �̷������� Ư�� �����ڸ� ȣ���ϰԲ� ������ �� ����
		
		System.out.println("Texi()");
	}
	
	Texi(String master, String model) {
		// super = �θ� Ŭ����
		super.master = master;
		super.model = model;
		
		// Texi.master��� �� super�� this�� ��������� ��
		// this.master = master;
	}
	
	// init = initialize
	void initPrice() {
		totalPrice = basicPrice;
	}
	
	int calPrice(int km) {
		int price = basicPrice + ( 1000 * km );
		totalPrice = price;
		
		return price;
	}
}
