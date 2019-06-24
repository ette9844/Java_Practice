package basicAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		// Date class 대신 Calender를 많이 씀
		// 대부분의 함수가 deprecated 됨
		Date now = new Date();
		String time = now.toString();
		System.out.println(time);
		
		// 원하는 형태로 출력하기 위해서는 format class 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd / hh:mm:ss");
		System.out.println(sdf.format(now));
	}
}
