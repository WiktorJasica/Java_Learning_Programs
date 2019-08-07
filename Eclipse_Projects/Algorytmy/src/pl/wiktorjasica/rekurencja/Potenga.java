package pl.wiktorjasica.rekurencja;

public class Potenga {
	
	public static void main(String[] args) {
		System.out.println(pow(2,3));
	}

	public static long pow(int p, int w) {
		if(w==0) {
			return 1;
		}
		else {
			return pow(p,w-1)*p;
		}
	}
}
