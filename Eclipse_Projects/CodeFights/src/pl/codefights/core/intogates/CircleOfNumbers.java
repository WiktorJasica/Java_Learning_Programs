package pl.codefights.core.intogates;

public class CircleOfNumbers {
	
	public static void main(String[] args) {
		System.out.println(circleOfNumbers(10, 2));
	}

	public static int circleOfNumbers(int n, int firstNumber) {
		int x = n / 2;
		if (firstNumber < x) {
			return x + firstNumber;
		} else {
			return Math.abs(x - firstNumber);
		}
	}
}
