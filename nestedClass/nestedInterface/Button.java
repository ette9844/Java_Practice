package nestedClass.nestedInterface;

public class Button {
	
	OnClickListener listener;
	
	// ���� ��ư �̳Ŀ� ���� �ٸ��� ����
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// ��ư�� ������ ���� �̺�Ʈ�� ������ �ϰ� �����ϱ� ��ø �������̽���
	interface OnClickListener {
		void onClick();
	}
}
