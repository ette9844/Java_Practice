package basicAPI;

public class EqualsEx {

	public static void main(String[] args) {
		Member mem1 = new Member("blue", "12345");
		Member mem2 = new Member("blue", "12345");
		// Member mem3 = new Member("red");
		
		if(mem1.equals(mem2))
			System.out.println("id�� pw�� �����ϴ�");
		else
			System.out.println("id�� pw�� �������� �ʴ�");
	}

}

class Member {
	public String id;
	public String pw;
	
	Member (String id, String pw) { this.id = id; this.pw = pw; }
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
		Member member = (Member) obj;
		if(id.equals(member.id) && pw.equals(member.pw))
			return true;
		}
		return false;
	}
}
