package classLecture;

public class TVEx {

	public static void main(String[] args) {
		
		TV samsung = new TV("�Ｚ");
		TV lg = new TV("LG");
		
		samsung.powerOn();
		samsung.volumeUp();
		samsung.inputChannel(50);
		
		samsung.powerOff();
		samsung.volumeUp();
		samsung.inputChannel(50);
		
	}

}
