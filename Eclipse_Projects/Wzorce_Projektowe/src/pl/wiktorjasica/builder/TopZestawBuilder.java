package pl.wiktorjasica.builder;

public class TopZestawBuilder extends Builder {

	@Override
	public void bulidMonitor() {
		zestawKomputerowy.setMonitor("Samsung");
	}

	@Override
	public void bulidHDD() {
		zestawKomputerowy.setHDD("Sata");
	}

	@Override
	public void bulidKartaGraficzna() {
		zestawKomputerowy.setKartaGraficzna("Radeon");
	}

	@Override
	public void bulidProcesor() {
		zestawKomputerowy.setProcesor("Intel");
	}

}
