package pl.codefights.core.allthecrossroads;

public class ExtraNumber {
	
	public static void main(String[] args) {

		System.out.println(extraNumber(2, 7, 2));
	}

	public static int extraNumber(int a, int b, int c) {

	    if(a==c){
	        return b;
	    }
	    if(a==b){
	        return c;
	    }
	    if(b==c){
	        return a;
	    }
	    return 0;
	}
}
