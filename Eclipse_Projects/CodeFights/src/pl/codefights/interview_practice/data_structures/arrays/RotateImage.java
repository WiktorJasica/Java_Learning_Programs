package pl.codefights.interview_practice.data_structures.arrays;

/*
 * Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked 
 * to do during an interview.

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Example

For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
the output should be

rotateImage(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 100,
a[i].length = a.length,
1 ≤ a[i][j] ≤ 104.

[output] array.array.integer

 */
public class RotateImage {

	public static void main(String[] args) {
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		a = rotateImage(a);
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static int[][] rotateImage(int[][] a) {
		int b[][]= new int [a.length][a.length];
		int el= a.length-1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				b[i][j]=a[el-j][i];
			}
		}
		return b;
	}
}
