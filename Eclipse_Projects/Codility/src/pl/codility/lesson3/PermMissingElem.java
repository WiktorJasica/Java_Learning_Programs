package pl.codility.lesson3;


public class PermMissingElem {
	
	public static void main(String[] args) {
		int[]A= {2,3,1,5};
		
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		
		for (int i = 0; i < A.length; i++)
        {
            if (A[i] == 0)
            {
                continue;   
            }
            
            int n = A[i] - 1;
            while (n != -1 && n < A.length)
            {
                int next = A[n] - 1;
                A[n] = 0;
                n = next;
            }
        }
        
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] != 0)
            {
                return i + 1;   
            }
        }
        
        return A.length + 1;
	}
}
