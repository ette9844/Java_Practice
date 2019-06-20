package nestedClass.anonymous;

public class Anonymous {
	
	Person person = new Person() {
		void walk() {	// ��ü ���鶧 �ѹ��� ���� ���� ��
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
				work();		// �Լ� �������� ��� ����
				System.out.println("wake Override_anonymous");
			}
		};
		localVar.wake();	// wake�� person Ŭ������ �޼ҵ��̹Ƿ� ��� ����
//		localVar.work();	// �� �ܿ��� ��� �Ұ�
		localVar.work(); 	// person Ŭ������ work()�� ����� �̸� override�ϸ� ��� ����
	}

	void method2(Person person) {
		person.wake();
	}
}
