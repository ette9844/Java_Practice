package homework10;

import java.util.regex.Pattern;

//p572 10번
public class PatternMatcherExample {

	public static void main(String[] args) {
	
		String id = "5Angel1004";
		String regExp = "[a-zA-Z]([a-zA-Z]|\\d){8,12}";
		
		boolean isMatch = Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}

}
