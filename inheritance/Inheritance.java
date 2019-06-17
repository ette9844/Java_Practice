package inheritance;


// 모든 클래스는 Object를 부모 클래스로 함 (extend Object)
// 하여 Object 내에 있는 함수를 사용할 수 있다

// API page: 
// Class Object is the root of the class hierarchy. 
// Every class has Object as a "superclass". 
// All objects, including arrays, implement the methods of this class.
public class Inheritance {

	public static void main(String[] args) {
		InheritanceTest it = new InheritanceTest();
		
		// 아무런 메소드를 생성하지 않아도 object의 메소드를 사용 가능
		String str = it.toString();
		System.out.println(str);
		
		// Texi-Car 예제
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
