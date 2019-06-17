package homework7;

class Unit {

	protected int x, y; // 현재 위치

	void move(int x, int y) {
		// 지정된 위치로 이동
		this.x = x;
		this.y = y;
		System.out.println("이동 (" + x + ", " + y + ")");
	}

	void stop() {
		// 현재 위치에 정지
		System.out.println("정지 (" + x + ", " + y + ")");
	}
}

// 보병
class Marine extends Unit {	
	void stimPack() {
		// 스팀팩을 사용한다
		System.out.println("스팀팩 사용");
	}
}

// 탱크
class Tank extends Unit {
	void changeMode() {
		// 공격모드로 변환한다
		System.out.println("공격모드");
	}
}

// 수송선
class Dropship extends Unit {
	void load() {
		// 선택된 대상을 태운다
		System.out.println("대상을 태웁니다");
	}
	
	void unload() {
		// 선택된 대상을 내린다
		System.out.println("대상을 내립니다");
	}
}