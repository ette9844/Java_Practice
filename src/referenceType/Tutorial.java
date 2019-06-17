package referenceType;

public class Tutorial {

	public static void main(String[] args) {
		// stack은 자동생성 됨
		String str = "yeo";
		String str2 = "yeo"; // 같은 값을 가지니까 스택에 같은 주소값이 저장 됨(heap은 하나)
		String str3 = new String("yeo"); // 새로 만들어 주어서 다른 주소값이 저장됨 
		// heap에 새 yeo 객체가 생성 됨

		System.out.println(str == str2); // true
		System.out.println(str == str3); // false -> ==는 스택에 저장된 주소값을 비교하므로

	}

}
