package pl.wiktorjasica.linked_list;

/**
 * Single node of the Linked List
 * @author Wiktor
 *
 * @param <T>
 */
public class Node<T> {

	private T value;
	private Node<T> next;

	public Node(T value) {
		this.value = value;
	}

	//Getters and Setters
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}
