package nestedClass.anonymous;

public class AnonymousEx {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		// �͸� ��ü �ʵ� ���
		anony.person.wake();
//		anony.person.walk();	// Person ��ü�� �����ִ� �޼ҵ�� wake �� (Override�ϸ� �� �� ����)
		
		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("study");
			}
			
			@Override
			void wake() {
				study();
				System.out.println("wake Override_method2_argument");
			}
		});
		
		anony.method2(new Person());
	}
}
