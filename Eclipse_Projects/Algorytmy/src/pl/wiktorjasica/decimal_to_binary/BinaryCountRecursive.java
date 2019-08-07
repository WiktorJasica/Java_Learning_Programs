package pl.wiktorjasica.decimal_to_binary;

public class BinaryCountRecursive {
	
	public static String binaryNr=""; 
	
	public static void main(String[] args) {
		
			binaryCount(12);
			System.out.println(binaryString(binaryNr));	
			
			
	}

	public static int binaryCount(int n) {		
		if(n==0) {
			return 0;
		}
		else {
			int x = n%2;
			binaryNr = binaryNr+x;
			return binaryCount(n/2)+x ;	
		}
		
	}
	
	public static String binaryString(String binaryNr) {
		String binString = binaryNr;
		System.out.println(binaryNr);
		binString = binString.trim();
		char[] words = binString.toCharArray();
		for(int i=0; i<words.length/2; i++) {
			char temp = words[i];
			words[i]=words[words.length-1-i];
			words[words.length-1-i]=temp;
		}
		binaryNr="";
		return new String(words);
	}
}
