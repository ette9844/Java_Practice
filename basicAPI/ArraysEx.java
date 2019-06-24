package basicAPI;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {

		int[] num = { 2, 3, 6, 1, 5 };

		// sort: ����
		Arrays.sort(num);
		for (int number : num) {
			System.out.print(number + " ");
		}
		System.out.println();

		// �ش� ���� index Ȯ��
		int index1 = Arrays.binarySearch(num, 6);
		System.out.println(index1);

		// string �迭 ����
		String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };
		Arrays.sort(names);
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();

		// �ش� ���� index Ȯ��
		int index2 = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println(index2);

		// compareTo�� �̿��� class sorting
		Member3 name1 = new Member3("ȫ�浿");
		Member3 name2 = new Member3("�ڵ���");
		Member3 name3 = new Member3("��μ�");

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

// compareTo�� �̿��� class sorting
class Member3 implements Comparable<Member3> {

	String name;

	Member3(String name) {
		this.name = name;
	}

	// name �ʵ常 ��
	@Override
	public int compareTo(Member3 o) {
		return name.compareTo(o.name);
	}
}