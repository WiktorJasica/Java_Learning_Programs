package pl.wiktorjasica.sorting_methods;

public class QuickSort2 {

	public static void main(String[] args) {
		int[] tab = { 9, 1, 2, 4, 5, 7, 8, 6, 3 };
		int left = 0;
		int right = tab.length-1;

		quickSort(tab, left, right);

		for (int i : tab) {
			System.out.print(i + " ");
		}

	}

	public static void quickSort(int[] tab, int left, int right) {

		if (left >=right) {
			return;
		}

		int border=left-1;
		int p = tab[right];
		
		for (int i = left; i <=right ; i++) {
			if (tab[i] < p) {
				border++;
				if (border != i) {
					int temp = tab[border];
					tab[border] = tab[i];
					tab[i] = temp;
				}
			}
		}

		border++;
		if (border != right) {
			int temp = tab[border];
			tab[border] = tab[right];
			tab[right] = temp;
		}
		quickSort(tab, left, border-1);
		quickSort(tab, border+1, right);

	}

}
