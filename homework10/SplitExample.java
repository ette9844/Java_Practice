package homework10;

import java.util.StringTokenizer;

//p571 8번
public class SplitExample {

	public static void main(String[] args) {
		
		String str = "아이디,이름,패스워드";
		
		// 방법1 (split() 메소드 이용)
		String[] arr1 = str.split(",");
		
		for(String arrs : arr1)
			System.out.println(arrs);
		
		System.out.println();
		
		// 방법2 (StringTokenizer 이용)
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
