package collectionFramework.set;

import java.util.*;

// set: 순서x 중복 비허용
public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("홍길동");
		set.add("신동권");
		set.add("전혜진");
		set.add("전혜진");	// 중복 허용 x
		
		// iterator 객체 생성
		Iterator<String> iter = set.iterator();
		
		// iterator를 이용한 set 순회
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}

}
