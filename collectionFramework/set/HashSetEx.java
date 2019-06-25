package collectionFramework.set;

import java.util.*;

// set: ����x �ߺ� �����
public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("ȫ�浿");
		set.add("�ŵ���");
		set.add("������");
		set.add("������");	// �ߺ� ��� x
		
		// iterator ��ü ����
		Iterator<String> iter = set.iterator();
		
		// iterator�� �̿��� set ��ȸ
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}

}
