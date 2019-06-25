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
		
		list.add(2, "swing");	// add: �ش� �ε����� add
		
		list.remove(2);			// remove: list���� ����
		list.remove("Java");
		
		list.clear();			// clear: list ��ü ����
		printList(list);
		System.out.println(list.isEmpty());
		
		// asList: ������ ��ü��� ������ list�� �����ϴ� ������ ���
		List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
		String str = stooges.get(1);
	}

	// eclipse ���: �ڵ� �巡�� -> ��Ŭ -> refactor -> extract method
	// �ش� �ڵ��� �޼ҵ带 �ڵ� ����
	public static void printList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
