package pl.wiktorjasica.factory;

public class NutAndBacaly extends Chocolate {

	public NutAndBacaly() {
		type=ChocolateType.WITH_NUTS;
	}
	
	public void addNuts() {
		System.out.println("Dodaje orzechy");
	}
	
	public void addBacaly() {
		System.out.println("Dodaje bakalie");
	}
	
	public void addSugar() {
		System.out.println("Dodaje cukier");
	}
	
	@Override
	public Chocolate getChocolate() {
		addBacaly();
		addNuts();
		addSugar();
		return this;
	}

}
