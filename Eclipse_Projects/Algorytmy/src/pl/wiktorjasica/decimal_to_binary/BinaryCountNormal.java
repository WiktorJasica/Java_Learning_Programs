package pl.wiktorjasica.decimal_to_binary;

public class BinaryCountNormal {

	public static void main(String[] args) {

		System.out.println(binaryCount(23));
	}

	public static String binaryCount(int n) {

		String binaryString = "";

		int change = n % 2;

		if (n == 0) {
			return "0";
		}

		while (n != 0) {
			binaryString = binaryString + change;
			n = n / 2;
			change = n % 2;
		}

		char[] words = binaryString.toCharArray();
		for (int i = 0; i < words.length / 2; i++) {
			char temp = words[i];
			words[i] = words[words.length - 1 - i];
			words[words.length - 1 - i] = temp;
		}

		return new String(words);
	}
}
