package interfaces;

class Laptop implements Bluetooth, USB, LanCard{
	
	String maker;
	double version;
	String capa;

	@Override
	public String getMaker() {
		return maker;
	}

	@Override
	public double getVersion() {
		return version;
	}

	@Override
	public String getCapability() {
		return capa;
	}
	
}

interface Bluetooth {
	String maker = "samsung";
	double version = 3.0;
	String capa = "128GB";
	
	public abstract String getMaker();
	public abstract double getVersion();
	public abstract String getCapability();
}

interface USB {
	String maker = "LG";
	double version = 12.1;
	String capa = "8GB";
	
	public abstract String getMaker();
	public abstract double getVersion();
	public abstract String getCapability();
}

interface LanCard {
	String maker = "MS";
	double version = 19.2;
	String capa = "256GB";
	
	public abstract String getMaker();
	public abstract double getVersion();
	public abstract String getCapability();
}

public class Intermain {
	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		Bluetooth bluetooth = laptop;
		
		System.out.println(bluetooth.getMaker());
		System.out.println(bluetooth.getVersion());
		System.out.println(bluetooth.getCapability());
	}
}
