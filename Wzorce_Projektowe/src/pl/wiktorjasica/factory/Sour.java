package pl.wiktorjasica.factory;

public class Sour extends Chocolate {	
	
	public Sour() {
		type=ChocolateType.DARK;
	}
	
	public void addVanila() {
		System.out.println("Dodaje Vanille");
	}

	@Override
	public Chocolate getChocolate() {
		addVanila();
		return this;
	}

}
