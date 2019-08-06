package pl.wiktorjasica.factory;

public class Main {

	public static void main(String[] args) {
		ChocolateFacory chocoFactory = new Factory();
		
		Chocolate milk = chocoFactory.produceChocolate(ChocolateType.MILK);
		Chocolate nuts = chocoFactory.produceChocolate(ChocolateType.WITH_NUTS);
		Chocolate dark = chocoFactory.produceChocolate(ChocolateType.DARK);
		
		milk.getChocolate();
		nuts.getChocolate();
		dark.getChocolate();
		
		System.out.println(milk);
	}
}
