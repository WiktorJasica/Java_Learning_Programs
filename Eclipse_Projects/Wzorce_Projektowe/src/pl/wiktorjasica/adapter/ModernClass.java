package pl.wiktorjasica.adapter;

public class ModernClass implements ModernRequest{
	
	private OldClass oldClass;
	
	public ModernClass() {
		this.oldClass = new OldClass();
	}
	
	@Override
	public int newRequest() {
		return oldClass.oldRequest();
	}

}
