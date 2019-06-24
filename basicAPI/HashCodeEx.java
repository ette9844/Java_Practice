package basicAPI;

// HashMap�� util ��Ű���� �������
import java.util.*;

public class HashCodeEx {

	public static void main(String[] args) {
		
		HashMap<Key, String> hashmap = new HashMap<>();
		// key���� Ŭ���� ���·� �Ѱ���� ��
		hashmap.put(new Key(1), "ȫ�浿");

		// new Key(1): �ڵ� �����δ� �����ϳ�, �ٸ� ��ü�� -> null ���
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
	
	// hashCode�� number���� ���ϵ��� override���ָ� get�� �ٸ��� �����Ͽ� ȫ�浿 ���
	@Override
	public int hashCode() {
		return number;
	}
}
