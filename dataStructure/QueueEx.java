package dataStructure;

// Queue = FIFO
// Ī��������
public class QueueEx {

	public static void main(String[] args) {
		Queue queue = new Queue() {

			char charArr[] = { ' ', ' ', ' ', ' ', ' ' };
			int first = 0;
			int last = 0;

			@Override
			public int size() {
				int cnt = 0;
				for (int i = 0; i < 5; i++) {
					if (charArr[i] != ' ')
						cnt++;
				}
				return cnt;
			}

			@Override
			public Object peek() {
				if (this.empty()) {
					System.out.println("�迭�� ������ϴ�");
					return false;
				}
				System.out.println("�б�: " + charArr[first]);
				return charArr[first];
			}

			@Override
			public Object pop() {
				char result = ' ';

				if (this.empty()) {
					System.out.println("�迭�� ������ϴ�");
					first = 0;
					last = 0;
					return false;
				}

				int tmp = first;
				result = charArr[first++];
				if (first >= 5) {
					first %= 5;
				}
				charArr[tmp] = ' ';
				System.out.println("���: " + result);
				return result;
			}

			@Override
			public boolean push(Object ob) {
				if (this.size() == 5) {
					System.out.println("�迭�� ���� á���ϴ�");
					return false;
				} else if (last >= 5) {
					last %= 5;
				}

				charArr[last++] = (char) ob;
				System.out.println("�Է�: " + charArr[last - 1]);
				return true;
			}

			@Override
			public boolean empty() {
				if (this.size() == 0)
					return true;
				return false;
			}
		};

		queue.push('A');
		queue.push('B');
		queue.push('C');
		queue.push('D');
		queue.push('E');
		queue.push('F');
		queue.pop();
		System.out.println(queue.size());
		queue.pop();
		System.out.println(queue.size());
		queue.pop();
		System.out.println(queue.size());

		queue.push('H');
		queue.push('I');
		queue.push('G');
		queue.push('M');
		queue.pop();
		queue.peek();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.push('A');

	}

}

interface Queue {
	public abstract int size(); // ���� ����

	public abstract Object peek(); // �б�

	public abstract Object pop(); // �а� ����

	public abstract boolean push(Object ob); // ����

	public abstract boolean empty(); // Ȯ��
}
