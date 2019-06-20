package dataStructure;

// Stack = LIFO
public class StackAns {

	public static void main(String[] args) {
		StackA stack = new StackA() {
			char[] charArr = new char[5];
			int pointer = 0;

			@Override
			public boolean push(Object ob) {
				if (pointer < 5) {
					charArr[pointer++] = (char) ob;
				} else {
					System.out.println("�迭�� ���� ���� �� �����ϴ�.");
					return false;
				}
				return true;
			}

			@Override
			public Object pop() {
				if (pointer != 0) {
					char result = charArr[--pointer];
					charArr[pointer] = ' ';
					return result;
				} else {
					System.out.println("�迭�� ���� �����ϴ�.");
				}
				return ' ';
			}

			@Override
			public int length() {
				return pointer;
			}

			@Override
			public Object peek() {
				if (pointer != 0) {
					char result = charArr[--pointer];
					pointer++;
					return result;
				} else {
					System.out.println("�迭�� ���� �����ϴ�.");
				}
				return ' ';
			}

		};
		
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println(stack.length());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.length());

	}

}

interface StackA {
	public abstract int length(); // ���� ����Ǿ��ִ� �������� ����

	public abstract Object pop(); // ����

	public abstract boolean push(Object ob); // ����

	public abstract Object peek(); // �б�
}
