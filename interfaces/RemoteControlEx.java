package interfaces;

// 익명 구현 객체
public class RemoteControlEx {

	public static void main(String[] args) {

		// 한번만 쓰고 버릴 클래스를 만드는 기능
		RemoteControl rc = new RemoteControl() {
			// 추상 메소드
			public void turnOn() {};
			public void turnOff() {};
			public void setVolume(int volume) {};
			public int getVolume() { return 0; };
		};
		
		rc.turnOn();
		rc.printTime();
		rc.turnOff();
	}

}
