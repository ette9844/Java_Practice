package homework2;

public class Exercise3_1 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = ((fahrenheit - 32) * 500 / 9 
				+ ((((fahrenheit - 32) * 500 / 9) % 10) >= 5 ? 1 : 0)) 
				/ 100.0f;
			
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius);
	}

}
