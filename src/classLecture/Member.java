package classLecture;

// p279 13-15
public class Member {

	String name; // 이름
	String id; // 아이디
	String password; // 패스워드
	int age; // 나이
	
	Member() {
		// 디폴트 생성자
		id = "hong";
		password = "12345";
	}

	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	// 로그인 메소드
	boolean login(String id, String password) {
		boolean result = false;
		
		if (this.id.equals(id) && this.password.equals(password))
			result = true;
		
		return result;
	}

	// 로그아웃 메소드
	boolean logout(String id) {
		boolean result = false;
		
		if(this.id.equals(id)) {
			System.out.println("로그아웃 되었습니다.");
			result = true;
		}
		
		return result;
	}
}
