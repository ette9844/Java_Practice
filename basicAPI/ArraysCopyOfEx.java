package basicAPI;

import java.util.Arrays;

public class ArraysCopyOfEx {

	public static void main(String[] args) {

		// 2���� �迭 ����
		int[][] ori = { { 1, 2 }, { 3, 4 } };
		
		// ���� ���� (�ּҰ��� �Ѿ)
		int[][] cloned1 = Arrays.copyOf(ori, ori.length);
		
		System.out.println(ori.equals(cloned1));				// �ּҰ� ��
		System.out.println(Arrays.equals(ori, cloned1));		// �ּҰ� ��
		System.out.println(Arrays.deepEquals(ori, cloned1));	// �� ��**
		
		System.out.println();
		
		// ���� ���� (�� heap�� �� ����)
		int[][] cloned2 = Arrays.copyOf(ori, ori.length);
		cloned2[0] = Arrays.copyOf(ori[0], ori[0].length);	// 2�� �迭�� clone[i]���� �ּҰ��� ��
		cloned2[1] = Arrays.copyOf(ori[1], ori[1].length);
		
		System.out.println(ori.equals(cloned2));				// �ּҰ� ��
		System.out.println(Arrays.equals(ori, cloned2));		// �ּҰ� ��
		System.out.println(Arrays.deepEquals(ori, cloned2));	// �� ��**
	}
}
