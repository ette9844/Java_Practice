package homework10;

// p568 4��
public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member("blue", "���Ķ�");
		System.out.println(member);
	}

}

class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
}

// p569 5��
/*
 	 (4) ������ ��ü�� Ŭ���� Ÿ�� -> Object Ÿ��
 	
*/