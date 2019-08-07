package pl.wiktorjasica.decimal_to_binary;

public class Iteration {
	
	public static void main(String[] args) {
		int nr = 12;
		
		System.out.println(decimalToBinary(nr));
		
	}
	
	public static String decimalToBinary(int nr) {
		
		String result="";
				
		while(nr!=0) {
			
		result = result.concat(String.valueOf(nr%2));	
		nr=nr/2;	
		}
		
		System.out.println(result);
		result = reverseString(result);
		
		return result;
	}
	
	public static  String reverseString(String str) {
		
		if(str.length()==1) {
			return str;
		}
		String result = "";
		
		result += str.charAt(str.length()-1) + reverseString(str.substring(0, str.length()-1)); 
		
		return result;
	}

}
