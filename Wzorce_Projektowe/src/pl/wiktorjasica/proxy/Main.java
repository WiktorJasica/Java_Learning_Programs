package pl.wiktorjasica.proxy;

public class Main {

	public static void main(String[] args) {
		
		ImageInterface image = new Image();
		System.out.println("Object without proxy:");
		System.out.println("First access: " + image.getImage());
		System.out.println("Second access: " + image.getImage());
 
		//
		// Odwo³ania do g³ównego obiektu z u¿yciem obiektu proxy
		//
		image = new ImageProxy();
		System.out.println("Object with proxy:");
		System.out.println("First access: " + image.getImage());
		System.out.println("Second access: " + image.getImage());		
		
	}
}
