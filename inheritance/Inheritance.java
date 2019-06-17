package inheritance;


// ��� Ŭ������ Object�� �θ� Ŭ������ �� (extend Object)
// �Ͽ� Object ���� �ִ� �Լ��� ����� �� �ִ�

// API page: 
// Class Object is the root of the class hierarchy. 
// Every class has Object as a "superclass". 
// All objects, including arrays, implement the methods of this class.
public class Inheritance {

	public static void main(String[] args) {
		InheritanceTest it = new InheritanceTest();
		
		// �ƹ��� �޼ҵ带 �������� �ʾƵ� object�� �޼ҵ带 ��� ����
		String str = it.toString();
		System.out.println(str);
		
		// Texi-Car ����
		Texi seoulTexi = new Texi();
		System.out.println(seoulTexi.totalPrice + " " + seoulTexi.master);
		
		Texi busanTexi = new Texi("lee", "Granzer");
		System.out.println(busanTexi.master + " " + busanTexi.model + " ");
		
		seoulTexi.run();
		seoulTexi.run();
		seoulTexi.run();
		seoulTexi.run();
		seoulTexi.calPrice(10);
		System.out.println(seoulTexi.totalPrice);
		
	}

}

class InheritanceTest {
	
}
