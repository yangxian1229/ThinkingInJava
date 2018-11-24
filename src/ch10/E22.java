package ch10;

interface Selector1 {
	boolean end();

	Object current();

	void next();
}

class Sequence1 {
	private Object[] items;
	private int next = 0;

	public Sequence1(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector implements Selector1 {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i < items.length)
				i++;
		}
	}

	public Selector1 selector() {
		return new SequenceSelector();
	}
	
	private Selector1 reverseSelector(){
		return new Selector1(){
			private int i = items.length-1;
			@Override
			public boolean end() {
				return i == -1;
			}

			@Override
			public Object current() {
				return items[i];
			}

			@Override
			public void next() {
				if(i >= 0)
					i--;
				
			}
			
		};
	}


	public static void main(String[] args) {
		Sequence1 sequence1 = new Sequence1(10);
		for (int i = 0; i < 10; i++)
			sequence1.add(Integer.toString(i));
		
		Selector1 selector1 = sequence1.reverseSelector();
		while(!selector1.end()){
			System.out.print(selector1.current()+" ");
			selector1.next();
		}
		
		//Selector selector = sequence.selector();
		/*while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}*/
	}
}/* Output:
9 8 7 6 5 4 3 2 1 0 
*/

public class E22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
