package basicAPI;

import java.util.Objects;

public class IsNullEx {

	public static void main(String[] args) {
		
		String str1 = "hong";
		String str2 = null;
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
	}

}
