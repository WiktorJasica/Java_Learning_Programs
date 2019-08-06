package pl.codefights.interview_practice.data_structures.arrays;

/*
 * Note: Write a solution that only iterates over the string once and uses O(1) additional memory, since 
 * this is what you would be asked to do during a real interview.

Given a string s, find and return the first instance of a non-repeating character in it. If there 
is no such character, return '_'.

Example

For s = "abacabad", the output should be
firstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
firstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.

Input/Output

[execution time limit] 3 seconds (java)

[input] string s

A string that contains only lowercase English letters.

Guaranteed constraints:
1 ≤ s.length ≤ 105.

[output] char

The first non-repeating character in s, or '_' if there are no characters that do not repeat.
 */
public class FirstNoRepeatingCharacter {

	private static final String SEQ = "abacabad";

	public static void main(String[] args) {
		System.out.println(firstNotRepeatingCharacter(SEQ));

	}

	public static char firstNotRepeatingCharacter(String s) {

		//Initialize evry cell in tab1 by 0
		int tab[] = new int[128];
		char result;
		for (int i = 0; i < tab.length; i++) {
			tab[i]=0;
		}
		
		for(char c: s.toCharArray()){
	        tab[c]++;
	    }
	    
	    for(char c : s.toCharArray()){
	        if(tab[c]==1){
	        	result= new Character(c);
	            return result;
	        }
	    }
	    return '-';

	}

}
