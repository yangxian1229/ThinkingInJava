package ch11;

import typeinfo.pets.*;
import java.util.*;


class NonCollectionSequence implements Iterable<Pet> {
	 protected Pet[] pets = Pets.createArray(8);
	 
	  public Iterator<Pet> iterator() {
	    return new Iterator<Pet>() {
	      private int index = 0;
	      public boolean hasNext() {
	        return index < pets.length;
	      }
	      public Pet next() { return pets[index++]; }
	      public void remove() { // Not implemented
	        throw new UnsupportedOperationException();
	      }
	    };
	  }
	  
	  public Iterable<Pet> reversed() {
		  return new Iterable<Pet>() {
			@Override
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>() {
					private int current = pets.length-1;
					public boolean hasNext() {
						return current > -1;
					}
					public Pet next() {
						return pets[current--];
					}
					public void remove() {
						 throw new UnsupportedOperationException();
					}
				};
			}
		  };
	  }
	  
	  public Iterable<Pet> randomized() {
		  return new Iterable<Pet>() {
			  public Iterator<Pet> iterator() {
				  List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
				  Collections.shuffle(shuffled,new Random(47));
				  return shuffled.iterator();
			  };
		  };
	  }
	  
	 
} 

public class E32 {
	public static void main(String[] args) {
	    NonCollectionSequence nc = new NonCollectionSequence();
	    InterfaceVsIterator.display(nc.iterator());
	    for(Pet p : nc.reversed())
	    	System.out.print(p + " ");
	    System.out.println();
	    for(Pet p : nc.randomized())
	    	System.out.print(p + " ");
	  }
}
