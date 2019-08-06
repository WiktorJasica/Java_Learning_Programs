package pl.wiktorjasica.builder;

public class Director {

	private Builder builder;
	
	public void setBuilder(Builder builder) {
		this.builder = builder; 
	}
	
	public void skladaj() {
		builder.newZestaw();
		builder.bulidMonitor();
		builder.bulidHDD();
		builder.bulidKartaGraficzna();
		builder.bulidProcesor();
	}
	
	public ZestawKomputerowy getZestaw() {
		return builder.getZestaw();
	}
}
