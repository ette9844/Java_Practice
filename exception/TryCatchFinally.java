package exception;

public class TryCatchFinally {

	// 형변환 함수
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
	// try-catch-finally

	public static void main(String[] args) {
		try {
			char[] ch = new char[5]; // ArrayIndexOutOfBounds Exception을 먼저 읽어서
			System.out.println(ch[5]); // 경고창 출력후 종료됨

			String data = null; // data: null -> 주소값이 없음
			System.out.println(data.toString()); // data의 주소값이 없으므로 NullPoint Exception

//		} catch(NullPointerException e) {			// NullPointerException이 발생되면 이 코드만 실행
//		} catch (Exception e) {	// array/pointer exception 모두 처리하고 싶으면 그 둘의 상위 클래스를 넣어주면 된다
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {	// or 연산 가능
			System.out.println("Exception 발생");

			// 에러 내용 출력
			e.printStackTrace();
		} finally { // exception이 생기든 안생기든 무조건 시행하는 코드 -> finally
			System.out.println("Exception 확인 종료");
		}

		// 두 exception을 따로 처리하고 싶을 경우
		try {
			char[] ch = new char[5];
			System.out.println(ch[4]);

			String data = null;
//			System.out.println(data.toString());
			
			String data1 = "100";
			String data2 = "a100";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);	// NumberFormatException
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생");
		} catch (Exception e){
			System.out.println("Exception 발생");
		} finally {
			System.out.println("Exception 확인 종료");
		}

//		char[] ch = new char[5];		
//		System.out.println(ch[5]);	// ArrayIndexOutOfBoundException
//		
//		String data1 = "100";
//		String data2 = "a100";
//		
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);	// NumberFormatException
//		
//		Dog dog = new Dog();
//		Cat cat = new Cat();
//		Animal animal = dog;
//		
//		dog = (Dog) animal;
//		changeDog(animal);
	}
}

// class cast exception
class Animal {
};

class Dog extends Animal {
};

class Cat extends Animal {
};