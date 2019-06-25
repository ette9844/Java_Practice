package collectionFramework.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// p777 9번
public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;		// 최고 점수를 받은 아이디 저장
		int maxScore = 0;		// 최고 점수 저장
		int totalScore = 0;		// 점수 합계 저장
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			int score = map.get(key);	// 해당 key의 점수 저장
			if(maxScore < score) {		// 최고 점수와 비교
				maxScore = score;		// 최고 점수 및 최고 점수 아이디 갱신
				name = key;
			}
			totalScore += score;		// 점수 합계 갱신
		}
		
		// 출력
		System.out.println("평균점수: " + totalScore / keys.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}

}
