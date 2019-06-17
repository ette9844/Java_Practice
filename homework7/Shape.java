package homework7;

class Circle extends Shape {
	
	double r;	// 반지름
	
	// 생성자
	Circle(double r) {
		super();
		this.r = r;
	}
	
	// 원의 면적 계산
	double calcArea() {
		return Math.PI * Math.pow(r,2);
	}
}

class Rectangle extends Shape {
	
	double width;	// 폭
	double height;	// 높이
	
	// 생성자
	Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// 사각형의 면적 계산
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

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
	
	// 정사각형인지 아닌지를 알려준다
	boolean isSquare() {
		boolean result = false;
		
		// 사각형 객체 이면서 가로 세로 길이가 같을 때
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
