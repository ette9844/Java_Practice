package collectionFramework.set;

import java.util.*;

// HashMap과 동일하나, 동기화된 메소드로 구성 / 멀티 스레드 환경에서 좋음 / 속도는 HashMap보다 딸림
public class HashTable {

	public static void main(String[] args) {
		
		// Map<>은 generic 타입이므로 <>내에 class로 된 것만 넣어야한다
		Map<String, Integer> map = new Hashtable<>();
		map.put("hong", 20);
		map.put("lee", 30);
		map.put("jeon", 40);

		map.get("hong"); // map에서 값을 가지고 오기위해선 key값이 필요함

		// key값을 모를 때에는 keySet을 이용하여
		// key로 이루어진 set을 생성
		Set<String> set = map.keySet();

		// 이후에는 set에서 값을 확인하는 방식과 동일
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + "\t: "); // key
			System.out.println(map.get(str)); // value
		}
	}

}
