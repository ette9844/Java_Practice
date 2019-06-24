package basicAPI;

public class ClassEx {

	public static void main(String[] args) {
		
		// class 객체 생성
		Car car = new Car();
		
		// class 생성 + 객체를 생성 못 할 시에 무슨 에러가 생성되는지 알 수 있음
		try {
			Class car1 = car.getClass();
			
			System.out.println(car1.getName());
			System.out.println(car1.getPackageName());
			
			Class car2 = Class.forName("basicAPI.Car");
//			Object obj = car2.newInstance(); // forname으로 생성된 class의 객체 생성 -> 이제는 안 쓰임
			
			System.out.println(car2.getName());
			System.out.println(car2.getPackageName());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

class Car {
	
	Car() {
		System.out.println("Car() 생성자");
	}
}