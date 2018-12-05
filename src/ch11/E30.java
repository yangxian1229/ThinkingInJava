package ch11;

import java.util.*;
import typeinfo.pets.*;

class PetSequeue {
	protected Pet[] pets = Pets.createArray(8);
}

class CollectionSequence2 extends PetSequeue implements Collection<Pet> {
	static void display(Iterator<Pet> it) {
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.print(p.id() + ":" + p+" ");
		}
		System.out.println();
	}
	static void display(Collection<Pet> pets){
		for(Pet p : pets)
			System.out.print(p.id() + ":" + p+" ");
		System.out.println();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pets.length;
	}
	
	@Override
	public Iterator<Pet> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Pet>() {
			private int index;
			public boolean hasNext() {
				return index < pets.length;
			}
			public Pet next(){return pets[index++];}
			public void remove(){throw new UnsupportedOperationException();}
		};
	}
	

	// Other methods, which are also need to be provided.
	@Override
	public boolean add(Pet e) {
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean addAll(Collection<? extends Pet> c) {
		throw new UnsupportedOperationException();
	}
	@Override
	public void clear() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean contains(Object o) {
		if(o==null) return false;
		for(int i=0;i<pets.length;i++)
			if(o.equals(pets[i])) return true;
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		Iterator<?> it = c.iterator();
		while (it.hasNext())
		if(!contains(it.next())) return false;
		return true;
	}
	@Override
	public boolean isEmpty() {
		return pets.length == 0; 
	}
	
	

	
	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
	
	
	@Override
	public Object[] toArray() {
		Object[] result = new Object[pets.length];
		System.arraycopy(pets, 0, result, 0, pets.length);
		return result;
	}

	@SuppressWarnings("unchecked")
	public <T> T[] toArray(T[] a) {
	if (a.length < pets.length)
	a = (T[])java.lang.reflect.Array.newInstance(
	a.getClass().getComponentType(), pets.length);
	T[] result = a;
	System.arraycopy(pets, 0, result, 0, pets.length);
	if (result.length > pets.length)
	result[pets.length] = null;
	return result;
	}
}

public class E30 {
	public static void main(String[] args) {
		CollectionSequence2 c = new CollectionSequence2();
		CollectionSequence2.display(c);
		CollectionSequence2.display(c.iterator());
		System.out.println(
		Arrays.toString(c.toArray(new Pet[0])));
	}
}
