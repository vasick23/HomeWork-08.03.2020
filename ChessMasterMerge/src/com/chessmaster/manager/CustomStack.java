package com.chessmaster.manager;
import java.util.Arrays;
public class CustomStack<T> {
	private int currentElementPosition = 0;
	private Object[] elements;
	private int INITIAL_SIZE = 10;
	public CustomStack() {
		elements = new Object[INITIAL_SIZE];
	}
	@SuppressWarnings("unchecked")
	public T pop() {
		T t = (T) elements[--currentElementPosition];
		elements[currentElementPosition] = null;
		return t;
	}
	public void push(T elementToPush) {
		if (currentElementPosition == elements.length) {
			expandSize();
		}
		elements[currentElementPosition++] = elementToPush;
	}
 
	public int size() {
		return currentElementPosition;
	}
	private void expandSize() {
		int increasedSize = elements.length * 2;
		elements = Arrays.copyOf(elements, increasedSize);
	}
}