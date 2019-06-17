package homework7;

public class Exercise2 {

	public static void main(String[] args) {
		
		MyTv t = new MyTv();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());

		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		
	}

}
