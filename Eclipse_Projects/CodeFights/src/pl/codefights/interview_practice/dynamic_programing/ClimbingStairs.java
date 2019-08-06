package pl.codefights.interview_practice.dynamic_programing;


/*
 * You are climbing a staircase that has n steps. You can take the steps either 1 or 2 at a time. 
 * Calculate how many distinct ways you can climb to the top of the staircase.

Example

For n = 1, the output should be
climbingStairs(n) = 1;

For n = 2, the output should be
climbingStairs(n) = 2.

You can either climb 2 steps at once or climb 1 step two times.

Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 50.

[output] integer

It's guaranteed that the answer will fit in a 32-bit integer.
 */
public class ClimbingStairs {

	public static void main(String[] args) {

		System.out.println(climbingStairs(42));
		
	}

	public static int climbingStairs(int n) {
		
		int [] result = {0};
		rec(n,result);		
		return result[0];
	}

	public static void rec(int n, int[] result) {

		if (n == 0) {
			result[0]++;
			return;
		}

		for (int i = 1; i <= 2; i++) {

			if (n >= i) {
				rec(n - i, result);
			}
		}
	}
}
