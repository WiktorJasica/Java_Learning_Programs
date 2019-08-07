package pl.wiktorjasica.reverse_number;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int nr =328;
		System.out.println(reverseNumber(nr));
	}
	
	public static int reverseNumber(int nr) {
			
			int x=0;
			int result=0;
			
			while(nr!=0) {
				x=nr%10;
				nr=nr/10;
				result = result*10+x;    
			}
		return result;
	}
}
