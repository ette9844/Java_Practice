package nestedClass.instanceMemberClass;

public class OutterEx {

	public static void main(String[] args) {
		
		Outter outter = new Outter();
		Outter.NestedClass nested = outter.new NestedClass();
		
		// 출력해보기
//		System.out.println(outter.outter);
//		outter.method();
//		outter.print();
		
//		System.out.println(nested.nested);
//		nested.method();
		nested.print();
	}
}
