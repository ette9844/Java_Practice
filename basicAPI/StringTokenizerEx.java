package basicAPI;

import java.util.*;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		String str = "This is a Test";
		
		// tokenizer
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// split
		String[] test = str.split(" ");
		for(String t : test) {
			System.out.println(t);
		}
		
		String[] test2 = str.split(" is a ");
		for(String t : test2) {
			System.out.println(t);
		}
	}
}
