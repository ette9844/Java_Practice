package basicAPI;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {

		int[] num = { 2, 3, 6, 1, 5 };

		// sort: 정렬
		Arrays.sort(num);
		for (int number : num) {
			System.out.print(number + " ");
		}
		System.out.println();

		// 해당 값의 index 확인
		int index1 = Arrays.binarySearch(num, 6);
		System.out.println(index1);

		// string 배열 정렬
		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();

		// 해당 값의 index 확인
		int index2 = Arrays.binarySearch(names, "홍길동");
		System.out.println(index2);

		// compareTo를 이용한 class sorting
		Member3 name1 = new Member3("홍길동");
		Member3 name2 = new Member3("박동수");
		Member3 name3 = new Member3("김민수");

		Member3[] memberName = { name1, name2, name3 };
		Arrays.sort(memberName);
		for (Member3 mem : memberName) {
			System.out.print(mem.name + " ");
		}
		System.out.println();
		
		index1 = Arrays.binarySearch(memberName, name1);
		System.out.println(index1);
	}
}

// compareTo를 이용한 class sorting
class Member3 implements Comparable<Member3> {

	String name;

	Member3(String name) {
		this.name = name;
	}

	// name 필드만 비교
	@Override
	public int compareTo(Member3 o) {
		return name.compareTo(o.name);
	}
}