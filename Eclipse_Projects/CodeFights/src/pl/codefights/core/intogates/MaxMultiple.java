package pl.codefights.core.intogates;

public class MaxMultiple {
	
	public static void main(String[] args) {
		System.out.println(maxMultiple(3, 10));
	}
	
	public static int maxMultiple(int divisor, int bound) {
		
		return divisor*(bound/divisor) ;
	}
}
