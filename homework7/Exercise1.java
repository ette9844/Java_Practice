package homework7;

public class Exercise1 {

	public static void main(String[] args) {
		MyTv t = new MyTv();

		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());

		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}

}
