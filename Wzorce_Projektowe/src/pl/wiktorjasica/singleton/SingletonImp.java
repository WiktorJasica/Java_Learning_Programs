package pl.wiktorjasica.singleton;

public class SingletonImp {

	private static SingletonImp instance = null;

	private SingletonImp() {
	};

	public static SingletonImp getInstance() {
		if (instance == null) {
			instance = new SingletonImp();
			return instance;
		}
		System.out.println("Object already exist");
		return instance;
	}
}
