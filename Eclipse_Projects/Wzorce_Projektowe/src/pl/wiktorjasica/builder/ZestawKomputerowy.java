package pl.wiktorjasica.builder;

public class ZestawKomputerowy {

	private String monitor;
	private String HDD;
	private String kartaGraficzna;
	private String procesor;

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}

	public void setKartaGraficzna(String kartaGraficzna) {
		this.kartaGraficzna = kartaGraficzna;
	}

	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}

	public String show() {
		return "ZestawKomputerowy: monitor=" + monitor + ", HDD=" + HDD + ", kartaGraficzna=" + kartaGraficzna
				+ ", procesor=" + procesor;
	}

}
