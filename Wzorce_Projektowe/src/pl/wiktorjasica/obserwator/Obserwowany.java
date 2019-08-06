package pl.wiktorjasica.obserwator;

public interface Obserwowany {
	
	public void dodajObserwatora(Obserwator obserwator);
	public void usunObserwatora(Obserwator obserwator);
	public void powiadamiajObserwtorow();
}
