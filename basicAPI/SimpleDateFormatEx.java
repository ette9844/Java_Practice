package basicAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		
		Date now = new Date();
	
		SimpleDateFormat sdf = new SimpleDateFormat("E����, "
				+ "yyyy ���� �� ��° �� w "
				+ "MM ���� �� ��° �� W");
		System.out.println(sdf.format(now));
	}

}
