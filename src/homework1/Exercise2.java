package homework1;

public class Exercise2 {

	public static void main(String[] args) {
		int numOfApples = 123;	// number of apples
		int sizeOfBucket = 10;	// max number of apples per bucket
		int numOfBucket = numOfApples / sizeOfBucket + 1;  // number of buckets
		
		System.out.println("필요한 바구니의 수 :" + numOfBucket);
	}
}
