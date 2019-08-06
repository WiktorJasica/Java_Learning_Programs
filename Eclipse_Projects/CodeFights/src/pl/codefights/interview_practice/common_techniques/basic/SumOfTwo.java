package pl.codefights.interview_practice.common_techniques.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * You have two integer arrays, a and b, and an integer target value v.
 *  Determine whether there is a pair of numbers, 
 *  where one number is taken from a and the other from b, 
 *  that can be added together to get a sum of v. Return true if such a pair exists, 
 *  otherwise return false.

Example

For a = [1, 2, 3], b = [10, 20, 30, 40], and v = 42, the output should be
sumOfTwo(a, b, v) = true.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

An array of integers.

Guaranteed constraints:
0 ≤ a.length ≤ 105,
-109 ≤ a[i] ≤ 109.

[input] array.integer b

An array of integers.

Guaranteed constraints:
0 ≤ b.length ≤ 105,
-109 ≤ b[i] ≤ 109.

[input] integer v

Guaranteed constraints:
-109 ≤ v ≤ 109.

[output] boolean

true if there are two elements from a and b which add up to v, and false otherwise.
 */
public class SumOfTwo {

	public static void main(String[] args) {
		int [] a = {1,2,3};
		int [] b = {10,20,30,40};
		int v = 42;
		
		System.out.println(sumOfTwo(a, b, v));
		System.out.println(sumOfTwo1(a, b, v));

	}
	
	//Binary search
	public static boolean sumOfTwo1(int [] a, int [] b, int v) {
		
		int [] sub = new int [b.length];
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    for(int i=0; i<b.length;i++){
	        sub[i]=v-b[i];
	    }
	    
	    //Binary search algorithm
	    for(int i:a){
	        
	        int l=0, r=sub.length-1;
	        
	        while(l<=r){
	            int m = (l+r)/2;
	            if(sub[m]==i){
	                return true;
	            }
	            if(sub[m]>i){
	                l=m+1;
	            }
	            else{
	                r=m-1;
	            }
	        }
	    }
	    
	    return false;
	}

	//Using Set Collection
	public static boolean sumOfTwo(int [] a, int [] b, int v) {
		
		Set <Integer> set  = new HashSet<>();
	    
	    for(int i: b){
	        set.add(v-i);
	    }
	    
	    for(int i: a){
	        if(set.contains(i)){
	            return true;
	        }        
	    }
	    return false;
	}
}
