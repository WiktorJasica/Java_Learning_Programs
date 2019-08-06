package pl.wiktorjasica.builder;

public class BudgetZestawBuilder extends Builder {

	@Override
	public void bulidMonitor() {
		zestawKomputerowy.setMonitor("LG");
	}

	@Override
	public void bulidHDD() {
		zestawKomputerowy.setHDD("ScanDisc");
	}

	@Override
	public void bulidKartaGraficzna() {
		zestawKomputerowy.setKartaGraficzna("Voddo");
	}

	@Override
	public void bulidProcesor() {
		zestawKomputerowy.setProcesor("AMD");
	}

}
