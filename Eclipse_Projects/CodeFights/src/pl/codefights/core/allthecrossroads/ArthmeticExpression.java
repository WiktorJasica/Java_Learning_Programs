package pl.codefights.core.allthecrossroads;

public class ArthmeticExpression {

	public static void main(String[] args) {
		System.out.println(arithmeticExpression(2, 3, 5));
	}

	public static boolean arithmeticExpression(int a, int b, int c) {
        
	    if((a+b)==c){
	        return true;
	    }
	    if((a-b)==c){
	        return true;
	    }
	    if((a*b)==c){
	        return true;
	    }
	    if(((a/b)==c)&&(a%b==0)){
	        return true;
	    }
	    return false;
	}
}
