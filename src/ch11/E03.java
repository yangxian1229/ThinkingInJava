package ch11;

import java.util.*;

interface Selector {
	boolean end();

	Object current();

	void next();
}

public class E03 {
	private Collection<Object> items = new ArrayList<Object>();

	public void add(Object x) {
		items.add(x);
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.size();
		}

		public Object current() {
			return ((ArrayList<Object>) items).get(i);
		}

		public void next() {
			if (i < items.size())
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		E03 sequence = new E03();
		for (int i = 0; i < 20; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
} /*
	 * Output: 0 1 2 3 4 5 6 7 8 9
	 */// :~
