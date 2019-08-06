package pl.codefights.interview_practice.common_techniques.basic;

/*
 * You have an array of integers nums and an array queries, 
 * where queries[i] is a pair of indices (0-based). 
 * Find the sum of the elements in nums from the indices at queries[i][0] to queries[i][1] (inclusive) 
 * for each query, then add all of the sums for all the queries together. 
 * Return that number modulo 109 + 7.

Example

For nums = [3, 0, -2, 6, -3, 2] and queries = [[0, 2], [2, 5], [0, 5]], the output should be
sumInRange(nums, queries) = 10.

The array of results for queries is [1, 3, 6], so the answer is 1 + 3 + 6 = 10.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer nums

An array of integers.

Guaranteed constraints:
1 ≤ nums.length ≤ 105,
-1000 ≤ nums[i] ≤ 1000.

[input] array.array.integer queries

An array containing sets of integers that represent the indices to query in the nums array.

Guaranteed constraints:
1 ≤ queries.length ≤ 3 · 105,
queries[i].length = 2,
0 ≤ queries[i][j] ≤ nums.length - 1,
queries[i][0] ≤ queries[i][1].

[output] integer

An integer that is the sum of all of the sums gotten from querying nums, taken modulo 109 + 7.
 */
public class SumInRange {

	public static void main(String[] args) {
		
		int [] nums = {3, 0, -2, 6, -3, 2};
		int [][] queries = {{0, 2},{2, 5},{0, 5}};
		
		int [] nums1 = {-1000};
		int [][] queries1 = {{0, 0}};
		
		System.out.println(sumInRange(nums, queries));
		System.out.println(sumInRange(nums1, queries1));
	}

	public static int sumInRange(int [] nums, int [][] queries) {
		
		 int m = (int) 1e9 + 7;
		    int [] p = new int [nums.length+1];
				int [] result = new int [queries.length];
				int sum = 0;
				int c=0;
			    p[0] = 0;
			    
			    for(int i=1; i<p.length;i++){
			        p[i]=p[i-1]+nums[i-1];
			    }
					   
			    for(int [] i: queries) {
			    	
			    	int l = i[0];
			    	int r = i[1];
			    	result[c] = p[r+1] - p[l];
			    	c++;
			    }
			    
			    for(int i=0; i<result.length; i++) {
			    	sum += result[i]; 
		            sum=(sum+m)%m;
			    }
				    
		        return (sum+m)%m;
	}
}
