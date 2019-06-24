package basicAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		// Date class ��� Calender�� ���� ��
		// ��κ��� �Լ��� deprecated ��
		Date now = new Date();
		String time = now.toString();
		System.out.println(time);
		
		// ���ϴ� ���·� ����ϱ� ���ؼ��� format class ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd / hh:mm:ss");
		System.out.println(sdf.format(now));
	}
}
