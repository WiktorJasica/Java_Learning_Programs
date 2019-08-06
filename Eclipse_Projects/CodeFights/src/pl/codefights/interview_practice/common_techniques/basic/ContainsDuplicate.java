package pl.codefights.interview_practice.common_techniques.basic;


import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers, write a function that determines whether the array contains any duplicates.
 *  Your function should return true if any element appears at least twice in the array, 
 *  and it should return false if every element is distinct.

Example

For a = [1, 2, 3, 1], the output should be
containsDuplicates(a) = true.

There are two 1s in the given array.

For a = [3, 1], the output should be
containsDuplicates(a) = false.

The given array contains no duplicates.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
0 ≤ a.length ≤ 105,
-2 · 109 ≤ a[i] ≤ 2 · 109.

[output] boolean
 */
public class ContainsDuplicate {
	
	public static void main(String[] args) {
		
		int a[] = {2,3,4,1,1};
		
		System.out.println(containsDuplicates(a));
		System.out.println(containsDuplicates1(a));
		System.out.println(containsDuplicates2(a));
	}
	
	public static boolean containsDuplicates(int[] a) {
	    
		Set<Integer> set = new HashSet<>();
	    
	    for(int i: a){
	        set.add(i);
	    }

	    return a.length!=set.size();
	}
	
	//Binary search solution
	public static boolean containsDuplicates2(int a[]) {
		//Arrays.sort(a);
		
		for(int i: a) {
			int l = 0;
			int r = a.length-1;
			
			while(l<=r) {
				int m = (l+r)/2;
				if(a[m]==i) {
					return true;
				}
				if(a[m]>i) {
					l=m+1;
				}
				else {
					r=m-1;
				}
			}
		}
		return false;
	}
	
	//Hardcoded solution
	public static boolean containsDuplicates1(int[ ]a) {
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j <a.length; j++) {
				if(i==j) continue;
				if((a[i]^a[j])==0) {
					return true;
				}
			}
		}
		return false;
	}

}
