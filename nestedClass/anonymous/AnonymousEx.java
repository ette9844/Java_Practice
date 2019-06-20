package nestedClass.anonymous;

public class AnonymousEx {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		// 익명 객체 필드 사용
		anony.person.wake();
//		anony.person.walk();	// Person 객체가 볼수있는 메소드는 wake 뿐 (Override하면 볼 수 있음)
		
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
