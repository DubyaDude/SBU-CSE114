public class StackOfObjects {
	private Object[] container;
	private int size;

	public StackOfObjects() {
		container = new Object[2];
		size = 0;
	}

	public int size() {
		return size;
	}

	public void push(Object object) {
		if (size > container.length)
			expand();

		container[size] = object;
		size++;
	}

	public Object pop() {
		if (size > container.length)
			expand();
		Object output = container[size - 1];
		container[size - 1] = null;
		size--;
		return output;
	}

	private void expand() {
		Object[] newContainer = new Object[container.length * 2];
		container = newContainer;
	}
}
