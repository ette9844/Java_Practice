package accessModifierA;

public class Account {
	
	// ��� ����
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private int balance; 		// �ܰ�
	
	// ������
	Account() {
		balance = 0;
	}
	
	// Setter
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance = balance;
	}
	
	// Getter
	public int getBalance() {
		return this.balance;
	}
}