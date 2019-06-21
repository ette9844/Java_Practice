package generic;

public class ContainerEx2 {

	public static void main(String[] args) {
		Container2<String, String> container1 = new Container2<String, String>();
		container1.set("ȫ�浿", "����");
		
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container2<String, Integer> container2 = new Container2<String, Integer>();
		container2.set("ȫ�浿", 35);
		
		String name2 = container2.getKey();
		int age = container2.getValue();
		
		System.out.println(name1 + " " + job);
		System.out.println(name2 + " " + age);
	}

}

class Container2<T, M> {

	private T key;
	private M value;
	
	public void set(T key, M value) {
		this.key = key;
		this.value = value;
	}

	public T getKey() {
		return key;
	}

	public M getValue() {
		return value;
	}
	
}