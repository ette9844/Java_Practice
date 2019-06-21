package generic.inheritance;

// Storage<T>�� ��� �޾����Ƿ� Storageimpl'<T>' �߰�
public class Storageimpl<T> implements Storage<T> {

	private T[] array;

	public Storageimpl(int cap) {
		// �Ϲ� �迭 ����
		// this.array = new Objecy[5];

		// generic �迭 ����
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