package pl.wiktorjasica.sorting_methods;

public class QuickSort {

	public static void main(String[] args) {

		int[] tab = { 3, 5, 2, 7, 1, 13, 9 };
		sort(tab);
		
		for(int i: tab) {
			System.out.print(i+" ");
		}
	}

	public static void sort(int[] tab) {

		int left = 0;
		int right = tab.length - 1;

		if ((tab == null) || (tab.length == 1)) {
			return;
		} else {
			quickSort(tab, left, right);
		}
	}

	private static void quickSort(int[] tab, int left, int right) {
		
		// >= bo kiedy tablica jest null to right jest równy -1
		if (left >= right) {
			return;
		}

		// left - 1 bo border na poczatku jest przed pierwszym elementem
		int border = left - 1;
		int i = left;
		int pivot = tab[right];

		
		while (i < right) {

			if (tab[i] < pivot) {
				border++;
				// warunek aby uniknac przestawiania samego siebie
				if (border != i) {
					int temp = tab[border];
					tab[border] = tab[i];
					tab[i] = temp;
				}
			}

			i++;
		}

		// wstawienie pivota w poprawnemiejsce w tablicy
		border++;
		if (border != right) {
			int temp = tab[border];
			tab[border] = tab[right];
			tab[right] = temp;
		}

		quickSort(tab, left, border - 1);
		quickSort(tab, border + 1, right);
		
	}

}
