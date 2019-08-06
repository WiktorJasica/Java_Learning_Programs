package pl.codefights.core.intogates;

public class LateRide {

	public static void main(String[] args) {
		System.out.println(lateRide(808));
	}
	
	public static int lateRide(int n) {
		
		int hh= n/60;
		int mm = n-(hh*60);
		
		return (hh/10 + hh%10)+ (mm/10 + mm%10);
	}
}
