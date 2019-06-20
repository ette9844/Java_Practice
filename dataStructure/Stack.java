package dataStructure;

public interface Stack {
	
	public abstract int length(); // ���� ����Ǿ��ִ� �������� ����

	public abstract Object pop(); // ����

	public abstract boolean push(Object ob); // ����

	public abstract Object peek(); // �б�
}

class CharStack implements Stack {

	// 5ĭ ¥�� char Ÿ�� array
	private char charStack[] = { ' ', ' ', ' ', ' ', ' ' };

	@Override
	public int length() { // ���� ����Ǿ��ִ� �������� ����
		int i;
		for (i = 0; i < charStack.length; i++) {
			if (charStack[i] == ' ')
				break;
		}
		return i;
	}

	@Override
	public Object pop() { // ����

		int i = this.length();
		
		// ������ ����ִٸ� false ����
		if (i == 0)
			return false;
		else { // ������ ������� �ʴٸ�
			// ������ ������ �� ����
			char tmp = charStack[i - 1];
			// stack ����
			charStack[i - 1] = ' ';
			// ��� �� ���
			return tmp;
		}
	}

	@Override
	public boolean push(Object ob) { // ����

		// ������ �� ���� �ʾҴٸ� �������� �߰�
		if (this.length() != 5) {
			charStack[this.length()] = (char) ob;
			return true;
		}
		// ������ �� á�� ��쿡�� false ����
		return false;
	}

	@Override
	public Object peek() { // �б�

		// ������ ����ִٸ� false ����
		if (this.length() == 0) {
			return false;
		} else // ������� �ʴٸ� ������ �� ����
			return charStack[this.length() - 1];
	}

}