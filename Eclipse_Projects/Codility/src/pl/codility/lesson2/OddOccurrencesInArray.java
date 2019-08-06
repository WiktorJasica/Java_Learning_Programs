package pl.codility.lesson2;

import java.util.Arrays;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int[] A = { 2,3, 1, 4, 2,3,1};

		System.out.println(solution(A));
		System.out.println(solution1(A));

	}
	
	public static int solution1(int [] A) {
		
		String numbers = Arrays.toString(A);
        char [] chars = numbers.toCharArray();
        int [] count = new int [128];
        Character result=' ';
        
        for(int i=0; i<count.length; i++){
            count[i]=0;
        }
        
        for(char c: chars){
            
            count[c]++;
        }
        
        for(char c: chars) {
        	if(count[c]==1 && c!=']'&& c!='[') {
        		result = new Character(c);
        	}
        }
        String s = result.toString();
        Integer num  = new Integer(s); 
        
        return  num;
	}

	
	//100%
	public static int solution(int[] A) {

		if (A.length == 0) {
			return 0;
		}
		int nr = A[0];

		for (int i = 1; i < A.length; i++) {
			nr = nr ^ A[i];
			System.out.print(nr);
		}
		System.out.println();
		return nr;
	}
}
