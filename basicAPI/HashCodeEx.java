package basicAPI;

// HashMap은 util 패키지에 들어있음
import java.util.*;

public class HashCodeEx {

	public static void main(String[] args) {
		
		HashMap<Key, String> hashmap = new HashMap<>();
		// key값은 클래스 형태로 넘겨줘야 함
		hashmap.put(new Key(1), "홍길동");

		// new Key(1): 코드 상으로는 동일하나, 다른 객체임 -> null 출력
		String value = hashmap.get(new Key(1));	
		System.out.println(value);
		
	}

}

class Key {
	public int number;
	
	Key(int number) { this.number = number; }
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number)
				return true;
		}
		return false;
	}
	
	// hashCode로 number값만 비교하도록 override해주면 get이 다르게 동작하여 홍길동 출력
	@Override
	public int hashCode() {
		return number;
	}
}
