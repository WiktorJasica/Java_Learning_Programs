package pl.wiktorjasica.linked_list;

public class LinkedListImpl<T> {

	private Node<T> head;

	/**
	 * Adding new node to Linked list
	 * @param value of the new node
	 */
	public void add(T value) {

		Node<T> newNode = new Node<T>(value);

		if (head == null) {
			head = newNode;
		} else {
			addNode(head, newNode);
		}
	}

	private void addNode(Node<T> node, Node<T> nodeRef) {

		if (node.getNext() == null) {
			node.setNext(nodeRef);
			return;
		}

		addNode(node.getNext(), nodeRef);
	}

	/**
	 * Traversing through all elements of the list 
	 */
	public void traverseList() {

		Node<T> temp = head;

		while (temp != null) {
			System.out.print(temp.getValue() + " ");
			temp = temp.getNext();
		}

	}

	/**
	 * Retreave head of the list
	 * @return
	 */
	public Node<T> getHead() {
		return this.head;
	}

}
