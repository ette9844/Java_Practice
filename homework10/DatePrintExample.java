package homework10;

import java.text.SimpleDateFormat;
import java.util.Date;

//p574 13��
public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY�� MM�� dd�� E���� hh�� mm��");
		System.out.println(sdf.format(now).toString());
	}

}
