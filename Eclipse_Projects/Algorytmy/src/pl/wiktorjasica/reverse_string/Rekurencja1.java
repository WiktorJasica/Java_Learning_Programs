package pl.wiktorjasica.reverse_string;

public class Rekurencja1 {
	
	static char[] tab;
	static int p;
	
	public static void main(String[] args) {
		
		String str = "abcdef";
		
		System.out.println(recursiveReverse(str));
		
	}
	
	public static String recursiveReverse(String str) {
		
		if(str==null || str.length()==1) {
			return str;
		}
		
		tab = str.toCharArray();
		p=tab.length-1;
		
		char[] tempTab = str.toCharArray();
		
		reverse(tempTab, 0, (tempTab.length-1)/2);
		
		String result = "";
		for(char c: tab) {
			result=result+c;
		}
		
		return result;
	}
	
	public static void reverse(char[] tempTab, int left, int right) {
		
		if(left>=right) {
			change(tempTab,left, p);
			p--;
			return;
		}
	
		int mid = (left+right)/2;
		reverse(tempTab, left, mid);
		reverse(tempTab, mid+1, right);
		
	}
	
	public static void change(char[]tempTab, int left,int p) {
		if(left==p)return;
		tab[left] = tab[p];
		tab[p]=tempTab[left];
	} 

}
