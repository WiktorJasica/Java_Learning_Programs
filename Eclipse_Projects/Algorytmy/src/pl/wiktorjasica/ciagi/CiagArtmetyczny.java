package pl.wiktorjasica.ciagi;

public class CiagArtmetyczny {

	public static void main(String[] args) {

		int[] tab = { 1, 2, 3, 4, 5, 6 };
		System.out.println(artmeticCug(tab));
	}

	public static boolean artmeticCug(int[] tab) {

		int sub = tab[1] - tab[0];

		for (int i = 1; i < tab.length; i++) {
			if (tab[i] - tab[i - 1] != sub) {
				return false;
			}
		}
		return true;
	}
}
