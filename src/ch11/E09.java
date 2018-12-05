package ch11;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Sequence09{
	private Object[] items;
	private int next = 0;
	public Sequence09(int size) { items = new Object[size]; }
	public void add(Object x) {
	    if(next < items.length)
	      items[next++] = x;
	} 
	private class SequenceIterator implements Iterator{
		private int i=0;

		@Override
		public boolean hasNext() {
			return i < items.length;
		}

		@Override
		public Object next() {
			if(hasNext())
				return items[i++];
			throw new NoSuchElementException();
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	public Iterator iterator(){
		return new SequenceIterator();
	}
}

public class E09 {
	public static void main(String[] args) {
		Sequence09 sequence = new Sequence09(10);
	    for(int i = 0; i < 10; i++)
	      sequence.add(Integer.toString(i));
	    
	    Iterator it = sequence.iterator();
	    while(it.hasNext()){
	    	System.out.print(it.next() + " ");
	    }
	}

}
