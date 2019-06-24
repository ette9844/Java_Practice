package basicAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		
		Date now = new Date();
	
		SimpleDateFormat sdf = new SimpleDateFormat("E요일, "
				+ "yyyy 년의 몇 번째 주 w "
				+ "MM 월의 몇 번째 주 W");
		System.out.println(sdf.format(now));
	}

}
