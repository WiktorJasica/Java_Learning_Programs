package pl.wiktorjasica.dupicate_chars_in_string;

public class DuplicateChars {

	private static final String SAMPLE = "abcaddbrsto";

	public static void main(String[] args) {

		char[] tab = findDuplicateChars(SAMPLE);

		for (char c : tab) {
			System.out.print(c + " ");
		}
	}

	public static char[] findDuplicateChars(String str) {

		int[] tab = new int[128];
		char[] tab1 = new char[128];
		int i = 0;

		for (char c : str.toCharArray()) {
			tab[c]++;
			if (tab[c] > 1 && tab[c] < 3) {
				tab1[i] = c;
				i++;
			}
		}
		return tab1;
	}
}
