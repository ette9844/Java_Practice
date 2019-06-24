package homework10;

import java.text.SimpleDateFormat;
import java.util.Date;

//p574 13번
public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(sdf.format(now).toString());
	}

}
