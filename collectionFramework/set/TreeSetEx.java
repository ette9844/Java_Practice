package collectionFramework.set;

import java.util.*;

// 이진 트리 기반의 set 컬렉션
// 자료가 트리 구조로 저장되어 검색이 빠름
public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<Integer> score = new TreeSet<>();
		score.add(60);	// 자동 박싱
		score.add(70);
		score.add(80);
		score.add(45);
		score.add(80);	// 중복 비허용
		score.add(new Integer(65));	// 객체를 만들어서 넣어줘도 ㅇㅋ(수동 박싱)
		
		int s = score.first();		// 가장 작은 값
		System.out.println(s);
		
		s = score.last();			// 가장 큰 값
		System.out.println(s);
		
		// 트리에 값을 넣으면 자동으로 정렬이 됨
		score.add(90);
		s = score.last();
		System.out.println(s);
		
		s = score.lower(95);		// 95 이하 중 가장 큰 값
		System.out.println(s);
		
		score.add(99);
		score.add(100);				// 100 이상 중 가장 작은 값
		s = score.higher(95);
		System.out.println(s);
		
		
	}

}
