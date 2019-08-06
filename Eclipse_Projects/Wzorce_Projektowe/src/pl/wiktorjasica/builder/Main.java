package pl.wiktorjasica.builder;

public class Main {

	public static void main(String[] args) {

		Director kierownik = new Director();
		
		kierownik.setBuilder(new TopZestawBuilder());
		kierownik.skladaj();
		System.out.println(kierownik.getZestaw().show());
		
		kierownik.setBuilder(new BudgetZestawBuilder());
		kierownik.skladaj();
		System.out.println(kierownik.getZestaw().show());
		
	}
}
