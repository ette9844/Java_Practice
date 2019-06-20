package interfaces;

interface RemoteControl {

	// ���
	public static final int MAX_VOLUME = 20;
	public static final int MIN_VOLUME = 0;

	// �߻� �޼ҵ�
	public abstract void turnOn();

	public abstract void turnOff();

	public abstract void setVolume(int volume);
	
	public abstract int getVolume();
	
	// �Ϲ� �޼ҵ�, �߻� �޼���� �����ϱ� ���� default �߰�
	public default void printTime() {
		System.out.println("����ð� ���");
	}
	
	// ���� �޼ҵ� (static)
	public static void changeBattery() {
		System.out.println("���͸� ��ȯ");
	}
}

class Audio implements RemoteControl {
	
	private int volume;
	
	
	public void printTime() {
		System.out.println("����ð� ���");
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
		
		// ���� �޼ҵ� ȣ��
		RemoteControl.changeBattery();

	}

}
