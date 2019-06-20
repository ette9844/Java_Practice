package homework8;

public class Exercise2 {

	public static void main(String[] args) {

		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
	}

}

class UnsupportedFuctionException extends RuntimeException {
	
	// 필드
	final private int ERR_CODE = 100;
	
	// 생성자
	UnsupportedFuctionException() {}
	UnsupportedFuctionException(String message, int code) {
		super("[" + code + "]" + message);
	}
	
	// 메소드
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return super.getMessage();
	}
}
