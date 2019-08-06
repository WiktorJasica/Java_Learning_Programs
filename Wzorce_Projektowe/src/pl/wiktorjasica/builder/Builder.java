package pl.wiktorjasica.builder;

public abstract class Builder {

	protected ZestawKomputerowy zestawKomputerowy;

	public void newZestaw() {
		this.zestawKomputerowy = new ZestawKomputerowy();
	}

	public ZestawKomputerowy getZestaw() {
		return zestawKomputerowy;
	}

	public abstract void bulidMonitor();

	public abstract void bulidHDD();

	public abstract void bulidKartaGraficzna();

	public abstract void bulidProcesor();
}
