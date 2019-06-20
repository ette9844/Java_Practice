package abstractClass;

// abstract class
// 추상 클래스는 실제가 없는 클래스이기 때문에 new를 이용한 객체 생성이 불가 (객체화 불가)
// 상속용 클래스 = 생성자를 private로 할 수 없음 (protected / public)
abstract class Phone {
	
	// 필드
	public String owner;
	
	// 생성자
	protected Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 추상 메소드: 자식 클래스에서 구현하지 않으면 오류
	public abstract void sound();
}

class SmartPhone extends Phone {
	
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	// 추상 메소드 구현
	@Override
	public void sound() {
		System.out.println("땡땡땡");
	}
}

public class PhoneEx {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("홍길동");
		// 추상 클래스는 실제가 없는 클래스이기 때문에 new를 이용한 객체 생성이 불가 (객체화 불가)
		// 상속용 클래스
//		Phone p = new Phone();		
		
		sp.turnOn();
		sp.internetSearch();
		sp.sound();
		sp.turnOff();
	}

}
