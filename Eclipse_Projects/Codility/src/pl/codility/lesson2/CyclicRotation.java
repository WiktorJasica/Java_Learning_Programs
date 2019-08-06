package pl.codility.lesson2;


public class CyclicRotation {

	public static void main(String[] args) {

		int tab[] = { 3, 8, 9, 7, 6};
		int tabRotated[] = solution(tab, 3);
		for (int number : tabRotated) {
			System.out.print(number);
		}
	}

	private static int[] solution(int[] A, int K) {
		
		if(A.length==0) {
			return A;
		}
		
		for (int i = 0; i < K; i++) {

			int temp[] = new int[A.length];
			int max = A[A.length - 1];

			for (int j = 1; j < A.length; j++) {
				temp[j] = A[j - 1];
			}

			temp[0] = max;

			for (int z = 0; z < A.length; z++) {
				A[z] = temp[z];
			}
		}

		return A;
	}
}
