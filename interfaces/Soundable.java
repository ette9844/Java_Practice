package interfaces;

// p386
public interface Soundable {
	public abstract String sound();
}

class Cat implements Soundable {

	@Override
	public String sound() {
		return "具克";
	}
	
}

class Dog implements Soundable {

	@Override
	public String sound() {
		return "港港";
	}
	
}