package basicAPI;

public class ClassEx {

	public static void main(String[] args) {
		
		// class ��ü ����
		Car car = new Car();
		
		// class ���� + ��ü�� ���� �� �� �ÿ� ���� ������ �����Ǵ��� �� �� ����
		try {
			Class car1 = car.getClass();
			
			System.out.println(car1.getName());
			System.out.println(car1.getPackageName());
			
			Class car2 = Class.forName("basicAPI.Car");
//			Object obj = car2.newInstance(); // forname���� ������ class�� ��ü ���� -> ������ �� ����
			
			System.out.println(car2.getName());
			System.out.println(car2.getPackageName());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

class Car {
	
	Car() {
		System.out.println("Car() ������");
	}
}