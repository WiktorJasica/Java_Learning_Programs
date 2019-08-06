package pl.codility.lesson3;

public class FrogJmp {
	
	public static void main(String[] args) {
		
		System.out.println(solution(10, 100, 20));
	}

	public static int solution(int X, int Y, int D) {
		
		int dist = Y-X;
		int jumps = dist/D;
		if(dist%D!=0) {
		return jumps+1;
		}
		return jumps;
	}
}
