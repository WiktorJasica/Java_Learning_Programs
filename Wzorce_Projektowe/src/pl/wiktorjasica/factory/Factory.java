package pl.wiktorjasica.factory;

public class Factory implements ChocolateFacory {

	@Override
	public Chocolate produceChocolate(ChocolateType type) {

		Chocolate chocolate = null;

		switch (type) {
		case MILK: {
			chocolate = new Milky();
			break;
		}
		case DARK: {
			chocolate = new Sour();
			break;
		}
		case WITH_NUTS: {
			chocolate = new NutAndBacaly();
			break;
		}
		}

		return chocolate;
	}

}
