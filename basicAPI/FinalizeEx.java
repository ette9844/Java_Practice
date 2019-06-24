package basicAPI;

public class FinalizeEx {
	public static void main(String[] args) {
		Counter counter = new Counter(1);
		System.out.println(counter.no);
		
		// 이전 삭제법: 주소값만 잃어버리는 식 -> gc를 이용한 자동삭제
		counter = null;
//		System.out.println(counter.no);	// exception 발생
		
		// 강제 삭제: gc 동작(컴퓨터가 여유가 있을때는 gc가 동작안하기 때문에 동작시키는 함수가 있다)
		System.gc();
		// finalize: gc가 동작할 때 호출되는 함수
		// gc를 호출해도 counter가 null이 아니면 garbage가 아니여서 삭제되지 않음
	}
}

class Counter {
	int no;
	
	Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체 삭제");
	}
}