package collectionFramework.set;

import java.util.*;

// HashMap�� �����ϳ�, ����ȭ�� �޼ҵ�� ���� / ��Ƽ ������ ȯ�濡�� ���� / �ӵ��� HashMap���� ����
public class HashTable {

	public static void main(String[] args) {
		
		// Map<>�� generic Ÿ���̹Ƿ� <>���� class�� �� �͸� �־���Ѵ�
		Map<String, Integer> map = new Hashtable<>();
		map.put("hong", 20);
		map.put("lee", 30);
		map.put("jeon", 40);

		map.get("hong"); // map���� ���� ������ �������ؼ� key���� �ʿ���

		// key���� �� ������ keySet�� �̿��Ͽ�
		// key�� �̷���� set�� ����
		Set<String> set = map.keySet();

		// ���Ŀ��� set���� ���� Ȯ���ϴ� ��İ� ����
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + "\t: "); // key
			System.out.println(map.get(str)); // value
		}
	}

}
