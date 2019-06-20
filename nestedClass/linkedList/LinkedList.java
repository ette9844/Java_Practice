package nestedClass.linkedList;

public class LinkedList {

	int size;
	Node head;
	Node rear;

	void firstNode(int num) {
		Node firstNode = new Node(num);

		head = firstNode;
		rear = firstNode;

		size = 1;
	}

	// ���� Node �߰�
	void addRearNode(int num) {
		if (size != 0) {
			Node newNode = new Node(num);

			rear.back = newNode;
			newNode.front = rear;
			rear = newNode;

			size++;

		} else
			firstNode(num);
	}

	// �մܿ� Node �߰�
	void addHeadNode(int data) {
		if (size != 0) {
			Node newNode = new Node(data);

			head.front = newNode;
			newNode.back = head;
			head = newNode;

			size++;
		} else
			firstNode(data);
	}

	// Ư�� ��ġ(index) Node Data �б�
	int readData(int index) { // 0 1 2...
		// index�� ����Ʈ ���̸� over�� ��
		if (index >= size || index < 0)
			return -1;

		// �ش� index�� ��� ã��
		Node result = head;
		for (int i = 0; i < index; i++) {
			result = result.back;
		}
		return result.num;
	}

	// Ư�� ��ġ(index) Node ����
	boolean removeNode(int index) {
		// index�� ����Ʈ ���̸� over�� ��, ����Ʈ�� ����� ��
		if (index >= size || index < 0 || size <= 0)
			return false;

		// ����Ʈ���� ����
		if (index == 0) { // head ����
			if (size == 1) {
				removeAllNode();
			} else {
				head.back.front = null;
				head = head.back;
			}
		} else if (index == size - 1) { // rear ����
			rear.front.back = null;
			rear = rear.front;
		} else {
			// �ش� index�� ��� ã��
			Node result = head;
			for (int i = 0; i < index; i++) {
				result = result.back;
			}
			result.front.back = result.back;
			result.back.front = result.front;
		}
		size--;

		return true;
	}

	// ��ü ����� data ���
	void printData() {
		try {
			Node tmp = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tmp.num + " ");
				tmp = tmp.back;
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("printData() Exception �߻�");
		}
	}

	// ��ü ���� (��Ȯ�� ������ �ƴ� -> �������� garbage collector�� ó������)
	boolean removeAllNode() {
		head = null;
		rear = null;
		size = 0;
		return true;
	}

	// Node ��ø Ŭ����
	class Node {
		int num;
		Node front;
		Node back;

		Node(int num) {
			this.num = num;
		}
	}

	// �׽�Ʈ
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.firstNode(1);
		link.addRearNode(2);
		link.addRearNode(3);
		link.addRearNode(4);
		link.addRearNode(5);
		link.printData();

		link.addHeadNode(0);
		link.addRearNode(6);
		link.printData();

		System.out.println(link.readData(3));
		System.out.println(link.readData(0));

		link.removeNode(4);
		link.printData();
		link.removeNode(0);
		link.printData();
		link.removeNode(4);
		link.printData();
		link.removeNode(7);
		link.printData();
		link.removeNode(0);
		link.printData();
		link.removeNode(0);
		link.printData();
		link.removeNode(0);
		link.printData();
		link.removeNode(0);
		link.printData();
		link.removeNode(0);
		link.printData();
	}
}
