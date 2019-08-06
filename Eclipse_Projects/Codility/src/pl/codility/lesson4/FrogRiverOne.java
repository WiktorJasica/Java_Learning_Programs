package pl.codility.lesson4;


public class FrogRiverOne {

	public static void main(String[] args) {

		int A[] = { 1, 3, 1, 4, 2, 3, 5, 4 };
		System.out.println(solution(5, A));
		System.out.println(solution1(5, A));

	}
	
	public static int solution(int X, int A[]) {

		int count = 0;
		int temp[] = new int [X];
		
		for(int i=0; i<X; i++) {
			temp[i]=i+1;
		}

		for(int i=0; i<A.length; i++) {
			if(A[i]==temp[A[i]-1]) {
				count++;
				temp[A[i]-1]=-1;
			}
			if(count==X) {
				return i;
			}
		}

		return -1;
	}

	public static int solution1(int X, int A[]) {

		int count = 0;
		int temp[] = new int [X];
		
		for(int i=0; i<X; i++) {
			temp[i]=i+1;
		}

		for (int i=0; i<A.length;i++) {
			for(int y=0; y<temp.length;y++) {
				if(A[i]==temp[y]) {
					temp[y]=-1;
					count++;
					System.out.print(count+" ");
				}
			}	
			
			if(count==X) {
				return i;
			}
		}

		return -1;
	}
}
