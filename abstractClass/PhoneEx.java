package abstractClass;

// abstract class
// �߻� Ŭ������ ������ ���� Ŭ�����̱� ������ new�� �̿��� ��ü ������ �Ұ� (��üȭ �Ұ�)
// ��ӿ� Ŭ���� = �����ڸ� private�� �� �� ���� (protected / public)
abstract class Phone {
	
	// �ʵ�
	public String owner;
	
	// ������
	protected Phone(String owner) {
		this.owner = owner;
	}
	
	// �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
	
	// �߻� �޼ҵ�: �ڽ� Ŭ�������� �������� ������ ����
	public abstract void sound();
}

class SmartPhone extends Phone {
	
	// ������
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// �޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	
	// �߻� �޼ҵ� ����
	@Override
	public void sound() {
		System.out.println("������");
	}
}

public class PhoneEx {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("ȫ�浿");
		// �߻� Ŭ������ ������ ���� Ŭ�����̱� ������ new�� �̿��� ��ü ������ �Ұ� (��üȭ �Ұ�)
		// ��ӿ� Ŭ����
//		Phone p = new Phone();		
		
		sp.turnOn();
		sp.internetSearch();
		sp.sound();
		sp.turnOff();
	}

}
