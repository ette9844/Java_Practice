package condition_iteration;

public class ExGrade {
	public static void main(String[] args) {
		// randomize 1~100
		int num = (int) (Math.random() * 101);
		String grade;

		// if - elseif - else
		if (num >= 90) {
			grade = "A";
		} else if (num >= 80) {
			grade = "B";
		} else if (num >= 70) {
			grade = "C";
		} else if (num >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("점수: " + num + "\n학점: " + grade);
		
		// switch
		switch(num / 10)
		{
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		
		System.out.println("-------------");
		System.out.println("점수: " + num + "\n학점: " + grade);
	}

}
