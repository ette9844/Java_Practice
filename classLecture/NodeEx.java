package classLecture;

// linked list class ex
class Node {

	static Node lastNode = null;

	int num;
	Node front;
	Node back;

	Node(int num) {
		this.num = num;
	}
	
	// ��ũ�� ����Ʈ�� append �ϱ�
	static void append(Node node) {
		if (lastNode == null) {
			lastNode = node;
		} else {
			node.front = lastNode;
			lastNode.back = node;
			lastNode = node;
		}
	}
}

public class NodeEx {
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		// ��ũ�� ����Ʈ�� �����
		Node.append(node1);
		Node.append(node2);
		Node.append(node3);
		
		// nodetmp ����Ʈ ���̿� �����ֱ� (����)
		Node nodetmp = new Node(9);
		nodetmp.front = node2;
		nodetmp.back = node3;
		nodetmp.front.back = nodetmp;
		nodetmp.back.front = nodetmp;
		
		// nodetmp ���� (����)
		nodetmp.front.back = nodetmp.back;
		nodetmp.back.front = nodetmp.front;
		nodetmp = null; 
		// ��� ����: �ּҰ��� null�� �ֱ�  -> nodetmp�� ������ ����� ������ -> garbage collector -> ����
		
		// ��ũ�� ����Ʈ ���
		Node tmp = node1;
		for(;tmp != null;) {
			System.out.print(tmp.num + " ");
			tmp = tmp.back;
		}
	}
}