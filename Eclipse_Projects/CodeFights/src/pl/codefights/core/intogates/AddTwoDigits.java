package pl.codefights.core.intogates;

public class AddTwoDigits {

	public static void main(String[] args) {
		
		System.out.println(addTwoDigits(25));
	}
	
	final static int addTwoDigits(int n) {

	    int x = n/10;
	    int y= n%10;
	    return x+y;
	}
	
}
