package pl.wiktorjasica.array_list;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList <Integer>list = new ArrayList<>();
		list.addElement(1);
		list.addElement(2);
		list.addElement(1);
		list.addElement(4);
		
		for(int i =0; i< list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("\n"+list.get(2));
		list.remove(2);
		System.out.println(list.get(2));
	}
	

}
