package classLecture;

// p279 13-15
public class Member {

	String name; // �̸�
	String id; // ���̵�
	String password; // �н�����
	int age; // ����
	
	Member() {
		// ����Ʈ ������
		id = "hong";
		password = "12345";
	}

	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	// �α��� �޼ҵ�
	boolean login(String id, String password) {
		boolean result = false;
		
		if (this.id.equals(id) && this.password.equals(password))
			result = true;
		
		return result;
	}

	// �α׾ƿ� �޼ҵ�
	boolean logout(String id) {
		boolean result = false;
		
		if(this.id.equals(id)) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			result = true;
		}
		
		return result;
	}
}
