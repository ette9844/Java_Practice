package collectionFramework.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// p777 9��
public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;		// �ְ� ������ ���� ���̵� ����
		int maxScore = 0;		// �ְ� ���� ����
		int totalScore = 0;		// ���� �հ� ����
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			int score = map.get(key);	// �ش� key�� ���� ����
			if(maxScore < score) {		// �ְ� ������ ��
				maxScore = score;		// �ְ� ���� �� �ְ� ���� ���̵� ����
				name = key;
			}
			totalScore += score;		// ���� �հ� ����
		}
		
		// ���
		System.out.println("�������: " + totalScore / keys.size());
		System.out.println("�ְ�����: " + maxScore);
		System.out.println("�ְ������� ���� ���̵�: " + name);
	}

}
