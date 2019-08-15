package pl.wiktorjasica.linked_list;

public class Main {

	public static void main(String[] args) {
		
		LinkedListImpl<Integer> list = new LinkedListImpl<>();
		list.add(4);
		list.add(6);
		list.add(3);
		list.add(7);
		list.add(3);
		list.add(1);
		list.add(3);
		
		list.traverseList();
		System.out.println();
		removeByKey(list, 3);
		list.traverseList();
	}
	
	public static void removeByKey(LinkedListImpl<Integer> list,int key) {
		
		Node<Integer> l = new Node<Integer>(null);
		l.setNext(list.getHead());
		
		while(l.getNext()!=null) {
			if(l.getNext().getValue()==key) {
				l.setNext(l.getNext().getNext());
			}
			else {	l=l.getNext();}
		}
	}
}
