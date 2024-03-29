package pl.codefights.interview_practice.data_structures.arrays;

/*
 	A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence between letters
 and digits, such that the given arithmetic equation consisting of letters holds true when the letters 
 are converted to digits.
 	
You have an array of strings crypt, the cryptarithm, and an an array containing the mapping of letters and digits,
solution. The array crypt will contain three non-empty strings that follow the structure: [word1, word2, word3],
which should be interpreted as the word1 + word2 = word3 cryptarithm.

If crypt, when it is decoded by replacing all of the letters in the cryptarithm with digits 
using the mapping in solution, becomes a valid arithmetic equation containing no numbers with leading zeroes,
the answer is true. If it does not become a valid arithmetic solution, the answer is false.

Example

For crypt = ["SEND", "MORE", "MONEY"] and

solution = [['O', '0'],
            ['M', '1'],
            ['Y', '2'],
            ['E', '5'],
            ['N', '6'],
            ['D', '7'],
            ['R', '8'],
            ['S', '9']]
the output should be
isCryptSolution(crypt, solution) = true.

When you decrypt "SEND", "MORE", and "MONEY" using the mapping given in crypt, you get 9567 + 1085 = 10652 
which is correct and a valid arithmetic equation.

For crypt = ["TEN", "TWO", "ONE"] and

solution = [['O', '1'],
            ['T', '0'],
            ['W', '9'],
            ['E', '5'],
            ['N', '4']]
the output should be
isCryptSolution(crypt, solution) = false.

Even though 054 + 091 = 145, 054 and 091 both contain leading zeroes, meaning that this is not a valid solution.
 */
public class IsCryptSolution {

	public static void main(String[] args) {

		String[] crypt = { "SEND", "MORE", "MONEY" };

		char[][] solution = { { 'O', '0' }, { 'M', '1' }, { 'Y', '2' }, { 'E', '5' }, { 'N', '6' }, { 'D', '7' },
				{ 'R', '8' }, { 'S', '9' } };

		System.out.println(solution(crypt, solution));

	}

	public static boolean solution(String[] crypt, char[][] solution) {

		char[] word1 = crypt[0].toCharArray();
		char[] word2 = crypt[1].toCharArray();
		char[] word3 = crypt[2].toCharArray();
		

		char[] nr1 = new char[word1.length];
		char[] nr2 = new char[word2.length];
		char[] nr3 = new char[word3.length];
		
		String val1="";
		String val2="";
		String val3="";
		
		for (int i = 0; i < word1.length; i++) {

			for (char[] c : solution) {
				if (word1[i] == c[0]) {
					nr1[i] = c[1]; 
					val1 = val1+nr1[i];
				}
			}
		}
		
		if(!val1.equals("0") && val1.startsWith("0")) {
			return false;
		};

		for (int i = 0; i < word2.length; i++) {

			for (char[] c : solution) {
				if (word2[i] == c[0]) {
					nr2[i] = c[1];
					val2 = val2+nr2[i];
				}
			}
		}
		
		if(!val2.equals("0") && val2.startsWith("0")) {
			return false;
		};

		for (int i = 0; i < word3.length; i++) {

			for (char[] c : solution) {
				if (word3[i] == c[0]) {
					nr3[i] = c[1];
					val3 = val3+nr3[i];
				}
			}
		}
		
		if(!val3.equals("0") && val3.startsWith("0")) {
			return false;
		};

		Long x = Long.parseLong(val1) + Long.parseLong(val2);
		Long z = Long.parseLong(val3);
		
		if(x.equals(z)) {
			return true;
		}

		return false;
	}
}
