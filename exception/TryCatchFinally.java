package exception;

public class TryCatchFinally {

	// ����ȯ �Լ�
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
	// try-catch-finally

	public static void main(String[] args) {
		try {
			char[] ch = new char[5]; // ArrayIndexOutOfBounds Exception�� ���� �о
			System.out.println(ch[5]); // ���â ����� �����

			String data = null; // data: null -> �ּҰ��� ����
			System.out.println(data.toString()); // data�� �ּҰ��� �����Ƿ� NullPoint Exception

//		} catch(NullPointerException e) {			// NullPointerException�� �߻��Ǹ� �� �ڵ常 ����
//		} catch (Exception e) {	// array/pointer exception ��� ó���ϰ� ������ �� ���� ���� Ŭ������ �־��ָ� �ȴ�
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {	// or ���� ����
			System.out.println("Exception �߻�");

			// ���� ���� ���
			e.printStackTrace();
		} finally { // exception�� ����� �Ȼ���� ������ �����ϴ� �ڵ� -> finally
			System.out.println("Exception Ȯ�� ����");
		}

		// �� exception�� ���� ó���ϰ� ���� ���
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
			System.out.println("ArrayIndexOutOfBoundsException �߻�");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException �߻�");
		} catch (Exception e){
			System.out.println("Exception �߻�");
		} finally {
			System.out.println("Exception Ȯ�� ����");
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