package pl.wiktorjasica.singleton;

public enum SingletonEnum {
	
	INSTANCE;
	
	private String name;
	private String age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public void  whatAreYouHiding() {
		if(name==null) {
			System.out.println("I dont have any name!");
		}
		else {
			System.out.println("name: "+name);
		}
		
		if(age==null) {
			System.out.println("I dont have any age!");
		}
		else {
			System.out.println("age: "+age);
		}
	}

}
