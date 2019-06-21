package generic.inheritance;

// Storage<T>를 상속 받았으므로 Storageimpl'<T>' 추가
public class Storageimpl<T> implements Storage<T> {

	private T[] array;

	public Storageimpl(int cap) {
		// 일반 배열 생성
		// this.array = new Objecy[5];

		// generic 배열 생성
		this.array = (T[]) (new Object[cap]);
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}

class Tv {}