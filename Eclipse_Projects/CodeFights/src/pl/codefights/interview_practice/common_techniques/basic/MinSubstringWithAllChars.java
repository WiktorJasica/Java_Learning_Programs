package pl.codefights.interview_practice.common_techniques.basic;

/*
 * You have two strings, s and t. The string t contains only unique elements. 
 * Find and return the minimum consecutive substring of s that contains all of the elements from t.

It's guaranteed that the answer exists. 
If there are several answers, return the one which starts from the smallest index.

Example

For s = "adobecodebanc" and t = "abc", the output should be
minSubstringWithAllChars(s, t) = "banc".

Input/Output

[execution time limit] 3 seconds (java)

[input] string s

A string consisting only of lowercase English letters.

Guaranteed constraints:
0 ≤ s.length ≤ 100.

[input] string t

A string consisting only of unique lowercase English letters.

Guaranteed constraints:
0 ≤ t.length ≤ min(26, s.length).

[output] string
 */
public class MinSubstringWithAllChars {

	public static void main(String[] args) {

		String s = "adobecodebanc";
		String t = "abc";

		System.out.println(minSubstringWithAllChars(s, t));

	}

	public static String minSubstringWithAllChars(String s, String t) {

		int n1 = s.length();
		int n2 = t.length();
		int nrOfChars = 128;
		int count = 0;
		int hashT[] = new int[nrOfChars];
		int hashS[] = new int[nrOfChars];

		for (int i = 0; i < n2; i++) {
			hashT[t.charAt(i)]++;
		}

		int l = 0, bestStart = -1, minLen = Integer.MAX_VALUE;

		for (int j = 0; j < n1; j++) {

			// count occurance of characters of string
			hashS[s.charAt(j)]++;

			// checking if string chracter is in patern. If there is occurence then
			// increasing counter
			if (hashT[s.charAt(j)] != 0 && hashS[s.charAt(j)] <= hashT[s.charAt(j)])
				count++;

			if (count == n2) {
				System.out.println(hashS[s.charAt(l)] + " " + hashT[s.charAt(l)]);
				while (hashT[s.charAt(l)] == 0 || hashS[s.charAt(l)] > hashT[s.charAt(l)]) {

					if (hashS[s.charAt(l)] > hashT[s.charAt(l)]) {
						hashS[s.charAt(l)]--;
					}

					l++;
				}
				int winLen = j - l + 1;

				if (minLen > winLen) {
					minLen = winLen;
					bestStart = l;
				}
			}
		}

		return s.substring(bestStart, bestStart + minLen);
	}

}
