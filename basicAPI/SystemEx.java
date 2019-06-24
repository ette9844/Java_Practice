package basicAPI;

public class SystemEx {

	public static void main(String[] args) {

		// exit 예제
		System.out.println("hong");

		for (int i = 0; i < 10; i++) {
			if(i == 10)
				// 프로그램 강제 종료 -> exception 발생 시 많이 쓰임
				System.exit(0);
		}
		
		// time 예제
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
		
//		long time2 = System.nanoTime();				// 나노 단위
		long time2 = System.currentTimeMillis();	// 밀리 단위
		System.out.println(time2 - time1);			// 소요시간 출력
		
		
		// 사용자 확인 예제
		String userName = System.getProperty("user.name");
		String userDir = System.getProperty("user.dir");
		
		System.out.println(userName);
		System.out.println(userDir);
		
	}

}
