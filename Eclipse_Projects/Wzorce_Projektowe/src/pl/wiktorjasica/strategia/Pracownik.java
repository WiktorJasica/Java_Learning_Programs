package pl.wiktorjasica.strategia;

public class Pracownik {

	private Praca praca = null;
	private Dojazd dojazd = null;
	private Hobby hobby = null;

	public Pracownik(String pracownik) {

		if (pracownik.equals("doktor")) {
			praca = new Doktor();
			dojazd = new Samochod();
			hobby = new Narty();
		} else if (pracownik.equals("sprzedawca")) {
			praca = new Sprzedawca();
			dojazd = new Tramwaj();
			hobby = new Ksiazki();
		}
		else if (pracownik.equals("listonosz")) {
			praca = new Listonosz();
			dojazd = new Rower();
			hobby = new PingPong();
		}
	}

	public void metchods() {
		praca.pracuj();
		dojazd.prowadzPojazd();
		hobby.relaksujSie();
	}
}
