package collectionFramework.set;

import java.util.*;

// ���� Ʈ�� ����� set �÷���
// �ڷᰡ Ʈ�� ������ ����Ǿ� �˻��� ����
public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<Integer> score = new TreeSet<>();
		score.add(60);	// �ڵ� �ڽ�
		score.add(70);
		score.add(80);
		score.add(45);
		score.add(80);	// �ߺ� �����
		score.add(new Integer(65));	// ��ü�� ���� �־��൵ ����(���� �ڽ�)
		
		int s = score.first();		// ���� ���� ��
		System.out.println(s);
		
		s = score.last();			// ���� ū ��
		System.out.println(s);
		
		// Ʈ���� ���� ������ �ڵ����� ������ ��
		score.add(90);
		s = score.last();
		System.out.println(s);
		
		s = score.lower(95);		// 95 ���� �� ���� ū ��
		System.out.println(s);
		
		score.add(99);
		score.add(100);				// 100 �̻� �� ���� ���� ��
		s = score.higher(95);
		System.out.println(s);
		
		
	}

}
