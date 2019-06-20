package nestedClass.anonymous;

public class Anonymous {
	
	Person person = new Person() {
		void walk() {	// 객체 만들때 한번만 쓰고 버릴 것
			System.out.println("walk");
		}
	};

	void method1() {
		Person localVar = new Person() {
			
			@Override
			void work() {
				System.out.println("work");
			}
			
			void wake() {
				work();		// 함수 내에서는 사용 가능
				System.out.println("wake Override_anonymous");
			}
		};
		localVar.wake();	// wake는 person 클래스의 메소드이므로 사용 가능
//		localVar.work();	// 그 외에는 사용 불가
		localVar.work(); 	// person 클래스에 work()를 만들고 이를 override하면 사용 가능
	}

	void method2(Person person) {
		person.wake();
	}
}
