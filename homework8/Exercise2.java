package homework8;

public class Exercise2 {

	public static void main(String[] args) {

		throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.", 100);
	}

}

class UnsupportedFuctionException extends RuntimeException {
	
	// �ʵ�
	final private int ERR_CODE = 100;
	
	// ������
	UnsupportedFuctionException() {}
	UnsupportedFuctionException(String message, int code) {
		super("[" + code + "]" + message);
	}
	
	// �޼ҵ�
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return super.getMessage();
	}
}
