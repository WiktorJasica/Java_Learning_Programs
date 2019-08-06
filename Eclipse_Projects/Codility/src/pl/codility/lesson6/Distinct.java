package pl.codility.lesson6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/*
 * Write a function

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class Distinct {
	
	public static void main(String[] args) {
		int A[] = {2,1,1,2,3,1};
		
		System.out.println(solution(A));
	}

	
	public static int solution(int A[]) {
		
		if(A.length==0) {
			return 0;
		}
		
		List<Integer> list = new ArrayList<>();
		
		int count=1;
		
		for(int i=0; i<A.length; i++) {
			list.add(A[i]);
		}
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		for(int i=0; i<list.size(); i++) {
			
			A[i]=list.get(i); 
		}
		
		for(int i=1; i<A.length;i++) {
			if(A[i]-A[i-1]!=0) {
				count++;
			}
		}
		
		return count;
	}
}

