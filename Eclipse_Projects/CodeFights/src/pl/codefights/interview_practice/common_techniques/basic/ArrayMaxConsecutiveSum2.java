package pl.codefights.interview_practice.common_techniques.basic;

/*
 * Given an array of integers, find the maximum possible sum you can get from one of its 
 * contiguous subarrays. The subarray from which this sum comes must contain at least 1 element.

Example

For inputArray = [-2, 2, 5, -11, 6], the output should be
arrayMaxConsecutiveSum2(inputArray) = 7.

The contiguous subarray that gives the maximum possible sum is [2, 5], with a sum of 7.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

An array of integers.

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The maximum possible sum of a subarray within inputArray.
 */
public class ArrayMaxConsecutiveSum2 {

	
	public static void main(String[] args) {
		
		int [] A = {-3, -2, -1, -4};
		
		System.out.println(arrayMaxConsecutiveSum2Naive(A));
		System.out.println(arrayMaxConsecutiveSum2Best(A));
	}
	
	
	//Best solution
	public static int arrayMaxConsecutiveSum2Best(int[] inputArray) {
		
		int max = inputArray[0];
	    int sum = max;
	    for(int i = 1 ; i < inputArray.length ; i++){
	        sum = Math.max(inputArray[i],inputArray[i]+sum);
	        max = Math.max(sum,max);
	    }
	    return max;
	}
	
	//Naive solution fail - one time execution test 
	public static int arrayMaxConsecutiveSum2Naive(int[] inputArray) {
	    
		int n = inputArray.length;
		int max=-1001;
		int [] p = new int [n+1];
		
		for(int i=0; i<n; i++) {
			
			for(int j=i+1; j<n+1; j++) {
				
				p[i]=0;
				p[j] = p[j-1] + inputArray[j-1];
			}
			
			for(int k=i+1; k<p.length;k++) {
				if(max<=p[k]) {
					max=p[k];
				}
			}	
		}
			    
	    return max;
	}

}
