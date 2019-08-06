package pl.codefights.core.intogates;

public class ProneCall {

	public static void main(String[] args) {

		System.out.println(phoneCall(3, 1, 2, 20));
	}

	public static int phoneCall(int min1, int min2_10, int min11, int s) {

		int count = 0;
		if (min1 <= s) {
			count++;
			s = s - min1;

			int count2 = 0;
			if (min2_10 <= s) {
				count2 += s / min2_10;
				if (count2 > 9) {
					count += 9;
					s = s - (min2_10 * 9);
					if (min11 <= s) {
						count += s / min11;

					}
				} else {
					count += count2;
					s = s - (min2_10 * count2);
				}
			}
		}
		return count;
	}
}
