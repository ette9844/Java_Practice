package referenceType;

public class ArrayEx {

	public static void main(String[] args) {
		// ¹è¿­ °´Ã¼ »ı¼º int num[] µµ ±¦ÂúÀ½
		int[] num = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for(int i=0; i<5; i++) {
			sum += num[i];
		}
		
		System.out.println(sum);
	}

}
