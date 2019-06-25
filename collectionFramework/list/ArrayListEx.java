package collectionFramework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JDBC");
		list.add("Python");
		list.add("Firebase");
		list.add("Cloud");
		
		list.add(2, "swing");	// add: 해당 인덱스에 add
		
		list.remove(2);			// remove: list에서 삭제
		list.remove("Java");
		
		list.clear();			// clear: list 전체 삭제
		printList(list);
		System.out.println(list.isEmpty());
		
		// asList: 고정된 객체들로 구성된 list를 생성하는 간단한 방법
		List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
		String str = stooges.get(1);
	}

	// eclipse 기능: 코드 드래그 -> 우클 -> refactor -> extract method
	// 해당 코드의 메소드를 자동 생성
	public static void printList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
