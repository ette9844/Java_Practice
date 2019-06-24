package basicAPI;

public class CloneEx {

	public static void main(String[] args) {
		Member2 original = new Member2("hong", "1234");
		Member2 clone = original.getMember2();
		
		clone.pw = "12345678";
		System.out.println(original.id + " " + original.pw);
		System.out.println(clone.id + " " + clone.pw);
	}

}

class Member2 implements Cloneable {
	String id;
	String pw;

	Member2(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public Member2 getMember2() {
		Member2 cloned = null;
		try {
			cloned = (Member2) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
