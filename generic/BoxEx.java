package generic;

public class BoxEx {
	public static void main(String[] args) {
		
		// 설계도에서는 무슨 타입인지 정해지지 않아도 되지만 main에서는 실제로 heap에 올라가므로
		// 타입을 명시해줘야함
		Box<String> box1 = new Box<String>();	// T <= String
//		Box<VV> box2 = new Box<VV>();			// T <= VV
		
		box1.set("Hello");
		String str = box1.get();
		System.out.println(str);
		
		// 지정한 타입 외의 타입을 넣으면 바로 에러
//		box1.set(23);
		
		// Object로 설정해두면 못 잡는 에러
		Box2 box2 = new Box2();
		box2.set("Hello");
		box2.set(12345);
		box2.set(3.04);
		
		// generic의 장점: 값을 넣을 때 강한 타입체크를 한다
		Box<Integer> box3 = new Box<>();
		box3.set(6);
		int value = box3.get();
		System.out.println(value);
		
	}
}

class VV {}