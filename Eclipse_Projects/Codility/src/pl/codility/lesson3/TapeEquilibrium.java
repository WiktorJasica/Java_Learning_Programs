package pl.codility.lesson3;

public class TapeEquilibrium {

	public static void main(String[] args) {
		
		int A[] = { 3, 1, 2, 4, 3 };
		int B[] = { -100, 100 };
		
		System.out.println(solution(B));
		System.out.println(solution1(A));
		System.out.println(solution2(A));
	}

	/*
	 * The best solution
	 */
	public static int solution(int[] A) {

		int sumL = A[0];
		int sumR = 0;
		int result = 0;

		for (int i = 1; i < A.length; i++) {
			sumR += A[i];
		}

		result = Math.abs(sumL - sumR);

		for (int p = 1; p < A.length; p++) {

			if (Math.abs(sumL - sumR) <= result) {
				result = Math.abs(sumL - sumR);
			}
			sumL += A[p];
			sumR -= A[p];
		}

		return result;
	}

	/*
	 * Also good solution
	 */
	public static int solution2(int[] A) {

		int[] tab1 = new int[A.length - 1];
		int[] tab2 = new int[A.length - 1];

		int sumL = 0;
		int sumR = 0;

		for (int i = 0; i < A.length - 1; i++) {
			sumL += A[i];
			tab1[i] = sumL;
		}

		for (int i = A.length - 1; i > 0; i--) {
			sumR += A[i];
			tab2[i - 1] = sumR;
		}

		int result = Math.abs(tab1[0] - tab2[0]);

		for (int i = 0; i < tab1.length; i++) {

			if (Math.abs(tab1[i] - tab2[i]) <= result) {
				result = Math.abs(tab1[i] - tab2[i]);
			}
		}

		return result;
	}

	/*
	 * Solution naive
	 */
	public static int solution1(int[] A) {
		
		int sum = Integer.MAX_VALUE;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 1; i < A.length; i++) {
			sum1 = 0;
			sum2 = 0;
			int p = i;

			for (int j = 0; j < p; j++) {
				sum1 += +A[j];
			}

			for (int z = p; z < A.length; z++) {
				sum2 += +A[z];
			}

			sum3 = Math.abs(sum1 - sum2);

			if (sum3 <= sum) {
				sum = sum3;
			}
		}

		return sum;
	}
}
