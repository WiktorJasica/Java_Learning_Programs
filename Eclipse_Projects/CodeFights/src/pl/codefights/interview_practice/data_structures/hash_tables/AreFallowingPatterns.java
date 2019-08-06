package pl.codefights.interview_practice.data_structures.hash_tables;

import java.util.*;

/*
 * Given an array strings, determine whether it follows the sequence given in the patterns array. 
 * In other words, there should be no i and j for which strings[i] = strings[j]
and patterns[i] ≠ patterns[j] or for which strings[i] ≠ strings[j] and patterns[i] = patterns[j].

Example

For strings = ["cat", "dog", "dog"] and patterns = ["a", "b", "b"], the output should be
areFollowingPatterns(strings, patterns) = true;

For strings = ["cat", "dog", "doggy"] and patterns = ["a", "b", "b"], the output should be
areFollowingPatterns(strings, patterns) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] array.string strings

An array of strings, each containing only lowercase English letters.

Guaranteed constraints:
1 ≤ strings.length ≤ 105,
1 ≤ strings[i].length ≤ 10.

[input] array.string patterns

An array of pattern strings, each containing only lowercase English letters.

Guaranteed constraints:
patterns.length = strings.length,
1 ≤ patterns[i].length ≤ 10.

[output] boolean

Return true if strings follows patterns and false otherwise.
 */
public class AreFallowingPatterns {

	public static void main(String[] args) {

		String[] strings = {"cat","dog", "dog"};
		String[] patterns = {"a","b","b"};

		System.out.println(areFallowingPaterns1(strings, patterns));

	}
	
	//Version 1
	public static boolean areFallowingPaterns1(String [] strings, String [] patterns) {
		
		Map<String, String> patternKeys = new HashMap<>();
	    Map<String, String> valueKeys = new HashMap<>();
	    
	    for (int i = 0; i < patterns.length; ++i) {
	        String pattern = patterns[i];
	        String value = strings[i];
	        if (patternKeys.containsKey(pattern) && !patternKeys.get(pattern).equals(value)) {
	            return false;
	        } else if (valueKeys.containsKey(value) && !valueKeys.get(value).equals(pattern)) {
	            return false;
	        }
	        else {
	            patternKeys.put(pattern, value);
	            valueKeys.put(value, pattern);
	        }
	    }
	    	    
	    return true;
	}
}
