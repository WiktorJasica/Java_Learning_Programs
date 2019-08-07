package pl.wiktorjasica.sorting_methods;

public class MyMergeSort {

	private static int[] tab = { 3, 5, 2, 7, 1, 13, 9 };
	private static int[] extraArray;

	public static void main(String[] args) {

		sort(tab);
		for (int i : tab) {
			System.out.print(i + " ");
		}
	}

	public static void sort(int[] tab) {

		extraArray = new int[tab.length];

		mergesort(tab, 0, tab.length - 1);

	}

	private static void mergesort(int[] tab, int leftIndex, int rightIndex) {

		if (leftIndex >= rightIndex) {
			return;
		}

		int middle = (leftIndex + rightIndex) / 2;

		mergesort(tab, leftIndex, middle);
		mergesort(tab, middle + 1, rightIndex);
		merge(tab, leftIndex, middle, rightIndex);

	}

	private static void merge(int[] tab, int leftIndex, int middle, int rightIndex) {
		for (int i = 0; i < tab.length; i++) {
			extraArray[i] = tab[i];
		}

		int pointer1 = leftIndex;
		int pointer2 = middle + 1;
		int current = leftIndex;

		while (pointer1 <= middle && pointer2 <= rightIndex) {
			if (extraArray[pointer1] <= extraArray[pointer2]) {
				tab[current] = extraArray[pointer1];
				pointer1++;
			} else {
				tab[current] = extraArray[pointer2];
				pointer2++;
			}
			current++;
		}

		while (pointer1 <= middle) {
			tab[current] = extraArray[pointer1];
			current++;
			pointer1++;
		}

	}
}
