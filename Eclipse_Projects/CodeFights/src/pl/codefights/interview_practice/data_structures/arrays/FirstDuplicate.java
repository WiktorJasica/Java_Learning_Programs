package pl.codefights.interview_practice.data_structures.arrays;

/*
 * Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate 
 * number for which the second occurrence has the minimal index. In other words, if there are more than 1 
 * duplicated numbers, return the number for which the second occurrence has a smaller index than the second 
 * occurrence of the other number does. If there are no such elements, return -1.

Example

For a = [2, 1, 3, 5, 3, 2], the output should be
firstDuplicate(a) = 3.

There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the 
second occurrence of 2 does, so the answer is 3.

For a = [2, 4, 3, 5, 1], the output should be
firstDuplicate(a) = -1.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ a.length.

[output] integer

The element in a that occurs in the array more than once and has the minimal index for its second 
occurrence. If there are no such elements, return -1.
 */
public class FirstDuplicate {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 5, 3, 2 };

		System.out.println(firstDuplicate1(arr));
		System.out.println(firstDuplicate(arr));
	}

	// version2
	public static int firstDuplicate1(int arr[]) {

		int temp[] = new int[100000];

		for (int i : arr) {
			temp[i]++;
			if (temp[i] > 1) {
				return i;
			}
		}
		return -1;
	}

	// version one
	public static int firstDuplicate(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i]) - 1] >= 0) {
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
			} else {
				return Math.abs(arr[i]);
			}
		}

		return -1;
	}

}
