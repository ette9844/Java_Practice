package homework7;

class Circle extends Shape {
	
	double r;	// ������
	
	// ������
	Circle(double r) {
		super();
		this.r = r;
	}
	
	// ���� ���� ���
	double calcArea() {
		return Math.PI * Math.pow(r,2);
	}
}

class Rectangle extends Shape {
	
	double width;	// ��
	double height;	// ����
	
	// ������
	Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// �簢���� ���� ���
	double calcArea() {
		return width * height;
	}
}

abstract class Shape {
	
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
	
	// ���簢������ �ƴ����� �˷��ش�
	boolean isSquare() {
		boolean result = false;
		
		// �簢�� ��ü �̸鼭 ���� ���� ���̰� ���� ��
		if(this instanceof Rectangle && ((Rectangle)this).width == ((Rectangle)this).height)
			result = true;
		
		return result;
	}

}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}
