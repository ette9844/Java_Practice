package homework10;

import java.util.StringTokenizer;

//p571 8��
public class SplitExample {

	public static void main(String[] args) {
		
		String str = "���̵�,�̸�,�н�����";
		
		// ���1 (split() �޼ҵ� �̿�)
		String[] arr1 = str.split(",");
		
		for(String arrs : arr1)
			System.out.println(arrs);
		
		System.out.println();
		
		// ���2 (StringTokenizer �̿�)
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
