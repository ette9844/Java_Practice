package interfaces;

// �͸� ���� ��ü
public class RemoteControlEx {

	public static void main(String[] args) {

		// �ѹ��� ���� ���� Ŭ������ ����� ���
		RemoteControl rc = new RemoteControl() {
			// �߻� �޼ҵ�
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
