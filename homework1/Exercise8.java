package homework1;

public class Exercise8 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ((ch >= '0' && ch <= '9') 
				|| (ch >= 'A' && ch <= 'Z') 
				|| (ch >= 'a' && ch <= 'z')) ? true : false;

		System.out.println(b);
	}
}
