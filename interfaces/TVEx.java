package interfaces;

interface RemoteControl {

	// 상수
	public static final int MAX_VOLUME = 20;
	public static final int MIN_VOLUME = 0;

	// 추상 메소드
	public abstract void turnOn();

	public abstract void turnOff();

	public abstract void setVolume(int volume);
	
	public abstract int getVolume();
	
	// 일반 메소드, 추상 메서드와 구분하기 위해 default 추가
	public default void printTime() {
		System.out.println("현재시간 출력");
	}
	
	// 정적 메소드 (static)
	public static void changeBattery() {
		System.out.println("배터리 교환");
	}
}

class Audio implements RemoteControl {
	
	private int volume;
	
	
	public void printTime() {
		System.out.println("현재시간 출력");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume >= RemoteControl.MAX_VOLUME ) {
			System.out.println("Max Volume now");
		} else if(volume <= RemoteControl.MIN_VOLUME) {
			System.out.println("Min Volume now");
		} else
			this.volume = volume;
	}
	
	@Override
	public int getVolume() {
		return this.volume;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Audio On");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio Off");
	}
}

class Television implements RemoteControl {
	
	public void printTime() {
		
	}
	
	@Override
	public void setVolume(int volume) {
		
	}
	
	@Override
	public int getVolume() {
	return 1;	
	}

	@Override
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}
	
}

public class TVEx {

	public static void main(String[] args) {

		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		System.out.println(rc.getVolume());
		rc.setVolume(10);
		System.out.println(rc.getVolume());
		
		// 정적 메소드 호출
		RemoteControl.changeBattery();

	}

}
