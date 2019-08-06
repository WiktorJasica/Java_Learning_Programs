package pl.wiktorjasica.array_list;

public class ArrayList<E> {

	private Object[] tab;
	private static int actualSize = 0;

	public ArrayList() {
		this.tab = new Object[3];
	}

	public void addElement(E e) {

		if (actualSize == tab.length) {
			Object[] temp = new Object[actualSize * 2];
			for (int i = 0; i < tab.length; i++) {
				temp[i] = tab[i];
			}
			tab = temp;
		}
		tab[actualSize] = e;
		actualSize++;
	}

	public Object remove(int index) {

		if (index < actualSize) {

			Object delElement = tab[index];
			tab[index] = null;
			while (index < actualSize) {
				tab[index] = tab[index + 1];
				index++;
			}

			actualSize--;
			return delElement;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public int size() {
		return actualSize;
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (index < actualSize || index >= 0) {
			return (E) tab[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

}
