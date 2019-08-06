package pl.codefights.core.intogates;

public class LargestNumber {
	
	public static void main(String[] args) {

		System.out.println(largestNumber(3));
	}

	public static int largestNumber(int n) {
		int number = 0;
		int x = 1;
		for (int i = 0; i < n; i++) {
			number = number + 9 * x;
			x = x * 10;
		}
		return number;
	}
}
