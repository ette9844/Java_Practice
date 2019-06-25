package collectionFramework.map;

import java.util.*;

// 키:값 쌍, 키는 중복 비허용
public class HashMapEx {

	public static void main(String[] args) {

		// Map<>은 generic 타입이므로 <>내에 class로 된 것만 넣어야한다
		Map<String, Integer> map = new HashMap<>();
		map.put("hong", 20);
		map.put("lee", 30);
		map.put("jeon", 40);
		
		map.get("hong");	// map에서 값을 가지고 오기위해선 key값이 필요함
		
		// key값을 모를 때에는 keySet을 이용하여 
		// key로 이루어진 set을 생성
		Set<String> set = map.keySet();
		
		// 이후에는 set에서 값을 확인하는 방식과 동일
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + "\t: ");		// key
			System.out.println(map.get(str));	// value
		}
	}

}
