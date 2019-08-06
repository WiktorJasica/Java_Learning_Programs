package pl.wiktorjasica.factory;

public class Milky extends Chocolate {
	
	public Milky() {
		type=ChocolateType.MILK;
	}
	
	public void addMilk() {
		System.out.println("Dodaje Mleko");
	}
	
	public void addSugar() {
		System.out.println("Dodaje cukier");
	}
	
	@Override
	public Chocolate getChocolate() {
		addMilk();
		addSugar();
		return this;
	}

}
