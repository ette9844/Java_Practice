package generic;

// generic example
public class Box<T> {
	
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
	
	// Box<T> boxing(T str) �տ� T�� ������� ��ǻ�Ϳ��� �˷��ִ� <T>�� �߰�
	public static <T> Box<T> boxing(T str) {
		Box<String> box = new Box<>();
		return (Box<T>) box;	// Box<T>�� ���ϰ��� �ڷ����� �ٸ��� ������ ����ȯ�� �ʿ�
	}
}

class Box2 {
	
	private Object t;
	public Object get() { return t; }
	public void set(Object t) { this.t = t; }
}

interface Box3<T> {

	// interface���� ���� ��� ����� �� �� �ִ�
	static int a = 0;
	public T get();
	public void set(T t);
}