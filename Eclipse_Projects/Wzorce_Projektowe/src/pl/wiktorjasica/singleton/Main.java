package pl.wiktorjasica.singleton;

public class Main {
	
	public static void main(String[] args) {
		
		SingletonImp instance = SingletonImp.getInstance();
		System.out.println(instance);
		SingletonImp instance2 = SingletonImp.getInstance();
		System.out.println(instance2);
		
		
		SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
		
		singletonEnum.whatAreYouHiding();
		singletonEnum.setAge("36");
		singletonEnum.setName("Wiktor");
		singletonEnum.whatAreYouHiding();
		
		SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
		singletonEnum2.whatAreYouHiding();
		
			
	}
}
