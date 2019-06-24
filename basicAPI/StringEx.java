package basicAPI;

public class StringEx {

	public static void main(String[] args) {

		// 기본 변수일때만 쓸 수 있는 스타일을 String에서만 지원
		String str = "abc";

		// 기본 변수
		char ch = 'c';
		int in = 10;

		// charAt: 아스키코드 값 (byte)를 문자열로 변환
		byte[] bytes = { 72, 101, 108, 108, 111, 13, 10 }; // 아스키 코드 값이 들어감
		String str1 = new String(bytes);
		System.out.println(str1);

		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			System.out.print(c);
		}

		String str2 = "Monday";

		try {
			// getBytes: encoding
			byte[] str2Bytes = str2.getBytes("UTF-8");

			for (byte B : str2Bytes) {
				System.out.print(B + " ");
			}
			System.out.println();

			// decoding
			String str3 = new String(str2Bytes);
			System.out.println(str3);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// indexOf
		String str4 = "ABCDEFGHIJ";
		// 문자열이 시작하는 index값 리턴 / 해당 문자열이 없으면 -1 리턴
		int index = str4.indexOf("HIJ");
		System.out.println("index: " + index);

		// replace
		String str5 = "안녕하세요. 자바입니다.";
		String str6 = str5.replace("자바", "JAVA");
		System.out.println(str6);

		// substring: 주민등록번호에서 생년월일 끊어낼 때 등등
		String str7 = "880808-2008088";
		String year = str7.substring(0, 2);
		String gender = str7.substring(7, 8);

		gender = (gender.equals("1") ? "남자" : "여자");
		System.out.println("19" + year + "년생 " + gender);

		// toLowreCase / toUpperCase: 대소문자 변환
		String str8 = "Hello Java";
		String lowercase = str8.toLowerCase();
		String uppercase = str8.toUpperCase();

		System.out.println(lowercase);
		System.out.println(uppercase);
		
		// valueOf
		String strInt = String.valueOf(100);
		String strBoolean = String.valueOf(true);
		String strDouble = String.valueOf(100.123);
		char[] charr = {'h', 'e', 'l', 'l', 'o'};
		String strCharArr = String.valueOf(charr);
		
		System.out.println(strInt);
		System.out.println(strBoolean);
		System.out.println(strDouble);
		System.out.println(strCharArr);
		
		System.out.println(Integer.valueOf(strInt));		
	}
}
