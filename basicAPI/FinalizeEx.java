package basicAPI;

public class FinalizeEx {
	public static void main(String[] args) {
		Counter counter = new Counter(1);
		System.out.println(counter.no);
		
		// ���� ������: �ּҰ��� �Ҿ������ �� -> gc�� �̿��� �ڵ�����
		counter = null;
//		System.out.println(counter.no);	// exception �߻�
		
		// ���� ����: gc ����(��ǻ�Ͱ� ������ �������� gc�� ���۾��ϱ� ������ ���۽�Ű�� �Լ��� �ִ�)
		System.gc();
		// finalize: gc�� ������ �� ȣ��Ǵ� �Լ�
		// gc�� ȣ���ص� counter�� null�� �ƴϸ� garbage�� �ƴϿ��� �������� ����
	}
}

class Counter {
	int no;
	
	Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "�� ��ü ����");
	}
}