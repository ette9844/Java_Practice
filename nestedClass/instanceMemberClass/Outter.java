package nestedClass.instanceMemberClass;

// 가장 일반적인 형식
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
			
			// Outter의 field와 method 불러오기
			System.out.println(Outter.this.outter);
			Outter.this.method();
		}
	}
}
