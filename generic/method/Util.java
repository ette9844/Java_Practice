package generic.method;

public class Util {

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare;
	}
	
	// extends를 통해 Number를 상속받은 클래스만 들어갈 수 있다
	public static <T extends Number> int compare(T t1, T t2) {
		// T가 숫자로 한정되었으므로 doubleValue 메소드를 사용할 수 있다
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
}
