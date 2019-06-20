package dataStructure;

public class QueueAns {

	public static void main(String[] args) {
		QueueA queue = new QueueA() {
			int length = 5;
			char[] arr = new char[length];
			int pIn = 0;
			int pOut = 0;

			// 0 1 2 3 4
			@Override
			public boolean push(Object ob) {
				if (size() < length) {
					arr[pIn] = (char) ob;
					pIn = (pIn + 1) % length;// 0 1 2 3 4
					System.out.println("�Է� : " + (char) ob);
					return true;
				} else {
					System.out.println("���� ���� �� �����ϴ�.");
					return false;
				}
			}

			@Override
			public Object pop() {
				char result = arr[pOut];
				arr[pOut] = ' ';
				pOut = (pOut + 1) % length;// 0 1 2 3 4
				System.out.println("��� : " + result);

				return result;
			}

			@Override
			public Object peek() {
				char result = arr[pOut];
				System.out.println("�б� : " + result);
				return result;
			}

			@Override
			public boolean empty() {
				boolean result;

				if (pIn == pOut) {
					result = false;
				} else {
					result = true;
				}
				return result;
			}

			@Override
			public int size() {
				int cnt = 0;
				for (int i = 0; i < length; i++) {
					if (((arr[i] >= 65) && (arr[i] <= 90)) || (arr[i] >= 97) && (arr[i] <= 122)) {
						cnt++;
					}
				}
				return cnt;
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

interface QueueA {
	public abstract int size(); // ���� ����

	public abstract Object peek(); // �б�

	public abstract Object pop(); // �а� ����

	public abstract boolean push(Object ob); // ����

	public abstract boolean empty(); // Ȯ��
}
