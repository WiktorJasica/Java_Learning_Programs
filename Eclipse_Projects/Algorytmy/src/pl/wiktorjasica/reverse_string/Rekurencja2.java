package pl.wiktorjasica.reverse_string;

public class Rekurencja2 {

	public static void main(String[] args) {

		String str = "abcdefg";

		System.out.println(strRevers(str));

	}

	public static String strRevers(String str) {

		if (str.length() == 1) {
			return str;
		} else {
			String reversed = "";

			reversed += str.charAt(str.length() - 1) + strRevers(str.substring(0, str.length() - 1));

			return reversed;
		}
	}

}
