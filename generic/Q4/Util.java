package generic.Q4;

public class Util<K, V> extends Pair<K, V> {

	public Util(K key, V value) {
		super(key, value);
	}

	public static <K, V> V getValue(Pair<K, V> pair, K key) {
		if (pair.getKey() == key) {
			return pair.getValue();
		} else
			return null;
	}

}
