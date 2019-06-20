package nestedClass.instanceMemberClass;

// ���� �Ϲ����� ����
public class Outter {
	
	String outter = "Outter field";
	
	void method() {
		System.out.println("Outter.method()");
	}
	
	void print() {
		System.out.println(this.outter);
		this.method();
	}
	
	class NestedClass {
		String nested = "nested field";
		
		void method() {
			System.out.println("NestedClass.method()");
		}
		
		void print() {
			System.out.println(this.nested);
			this.method();
			
			// Outter�� field�� method �ҷ�����
			System.out.println(Outter.this.outter);
			Outter.this.method();
		}
	}
}
