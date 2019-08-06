package pl.codefights.interview_practice.sorting_searching.backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * You need to climb a staircase that has n steps, and you decide to get some extra exercise by jumping up the steps. 
 * You can cover at most k steps in a single jump. Return all the possible sequences of jumps that you could take to climb the staircase, sorted.

Example

For n = 4 and k = 2, the output should be

climbingStaircase(n, k) =
[[1, 1, 1, 1],
 [1, 1, 2],
 [1, 2, 1],
 [2, 1, 1],
 [2, 2]]
There are 4 steps in the staircase, and you can jump up 2 or fewer steps at a time. 
There are 5 potential sequences in which you jump up the stairs either 2 or 1 at a time.

Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
0 ≤ n ≤ 10.

[input] integer k

Guaranteed constraints:
0 ≤ k ≤ n.

[output] array.array.integer

An array containing all of the possible sequences in which you could climb n steps by taking them k or fewer at a time.
 */
public class ClimbingStaircase {

	public static void main(String[] args) {
		
		int result [][] = climbingStaircase(4, 2);
		
	}
	
	public static int [][] climbingStaircase(int n, int k){
		
		return null;
	}
	
	public void backtrack(int n, int k, List<List<Integer>> result, List<Integer> tempList){
		
		   if(n==0){
		      result.add(new ArrayList<>(tempList)); 
		      return;
		   }
		   
		   for(int i=1; i<=k; i++){
		        if(n>=i){
		           tempList.add(i);
		           backtrack(n-i, k, result, tempList);
		           tempList.remove(tempList.size()-1);
		        }
		   }
		}
}
