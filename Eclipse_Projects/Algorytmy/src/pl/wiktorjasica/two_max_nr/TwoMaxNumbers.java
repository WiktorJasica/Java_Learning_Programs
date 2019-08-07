package pl.wiktorjasica.two_max_nr;

public class TwoMaxNumbers {

	public static void main(String[] args) {
		int[] tab = {5,34,78,2,45,1,99,23};
		twoMaxNumbers(tab);
	}

	public static void twoMaxNumbers(int[] tab) {

		int max1 = tab[0];
		int max2 = tab[1];

		for (int i = 2; i < tab.length; i++) {
			
			if(max2>max1) {
				int temp = max1;
				max1=max2;
				max2=temp;
			}
			if(max2<tab[i]) {
				max2=tab[i];
			}
			
		}
		
		System.out.println(max1+" "+max2);
	}
}
