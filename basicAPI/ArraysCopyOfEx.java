package basicAPI;

import java.util.Arrays;

public class ArraysCopyOfEx {

	public static void main(String[] args) {

		// 2차원 배열 복사
		int[][] ori = { { 1, 2 }, { 3, 4 } };
		
		// 얕은 복사 (주소값만 넘어감)
		int[][] cloned1 = Arrays.copyOf(ori, ori.length);
		
		System.out.println(ori.equals(cloned1));				// 주소값 비교
		System.out.println(Arrays.equals(ori, cloned1));		// 주소값 비교
		System.out.println(Arrays.deepEquals(ori, cloned1));	// 값 비교**
		
		System.out.println();
		
		// 깊은 복사 (새 heap에 값 복사)
		int[][] cloned2 = Arrays.copyOf(ori, ori.length);
		cloned2[0] = Arrays.copyOf(ori[0], ori[0].length);	// 2중 배열은 clone[i]값에 주소값이 들어감
		cloned2[1] = Arrays.copyOf(ori[1], ori[1].length);
		
		System.out.println(ori.equals(cloned2));				// 주소값 비교
		System.out.println(Arrays.equals(ori, cloned2));		// 주소값 비교
		System.out.println(Arrays.deepEquals(ori, cloned2));	// 값 비교**
	}
}
