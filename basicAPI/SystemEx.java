package basicAPI;

public class SystemEx {

	public static void main(String[] args) {

		// exit ����
		System.out.println("hong");

		for (int i = 0; i < 10; i++) {
			if(i == 10)
				// ���α׷� ���� ���� -> exception �߻� �� ���� ����
				System.exit(0);
		}
		
		// time ����
//		long time1 = System.nanoTime();
		long time1 = System.currentTimeMillis();
		
		for(int i=0; i<1000; i++) {	
			if( i == 999)
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
//		long time2 = System.nanoTime();				// ���� ����
		long time2 = System.currentTimeMillis();	// �и� ����
		System.out.println(time2 - time1);			// �ҿ�ð� ���
		
		
		// ����� Ȯ�� ����
		String userName = System.getProperty("user.name");
		String userDir = System.getProperty("user.dir");
		
		System.out.println(userName);
		System.out.println(userDir);
		
	}

}
