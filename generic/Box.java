package generic;

// generic example
public class Box<T> {
	
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
	
	// Box<T> boxing(T str) 앞에 T를 사용함을 컴퓨터에게 알려주는 <T>를 추가
	public static <T> Box<T> boxing(T str) {
		Box<String> box = new Box<>();
		return (Box<T>) box;	// Box<T>와 리턴값의 자료형이 다르기 때문에 형변환이 필요
	}
}

class Box2 {
	
	private Object t;
	public Object get() { return t; }
	public void set(Object t) { this.t = t; }
}

interface Box3<T> {

	// interface에는 변수 대신 상수가 들어갈 수 있다
	static int a = 0;
	public T get();
	public void set(T t);
}