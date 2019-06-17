package inheritance;

public class Texi extends Car {
	
	int totalPrice = 0;
	int basicPrice = 3000;
	String master = "ahh";
	
	Texi() {
		// 보이지는 않지만 부모클래스의 생성자가 호출됨
		// super();
		// super("yeo");		// 이런식으로 특정 생성자를 호출하게끔 유도할 수 있음
		
		System.out.println("Texi()");
	}
	
	Texi(String master, String model) {
		// super = 부모 클래스
		super.master = master;
		super.model = model;
		
		// Texi.master라는 뜻 super와 this로 구분해줘야 함
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
