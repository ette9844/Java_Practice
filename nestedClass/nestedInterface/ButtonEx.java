package nestedClass.nestedInterface;

public class ButtonEx {

	public static void main(String[] args) {
		
		Button btn = new Button();
	
		// ��ȭ �Ŵ� ��ư���� ����
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		// �޼��� ������ ��ư���� ����
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
