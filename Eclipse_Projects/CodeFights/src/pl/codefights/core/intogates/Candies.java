package pl.codefights.core.intogates;

public class Candies {
	
	public static void main(String[] args) {
		
		System.out.println(candies(3, 10));
	}
	
	public static int candies(int n, int m) {
		return n*(m/n);
	}
}
