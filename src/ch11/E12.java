package ch11;

import java.util.*;

public class E12 {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5,6,7,8));
		ListIterator<Integer> fwd = ints.listIterator();
		
		List<Integer> ints1 = new ArrayList<Integer>(ints);
		ListIterator<Integer> rev = ints1.listIterator(ints1.size());
		
		while(fwd.hasNext()){
			Integer tmp = fwd.next();
			rev.previous();
			rev.set(tmp);
		}
		System.out.println("ints: "+ints);
		System.out.println("ints1: "+ints1);
	}
}/* Output:
ints: [1, 2, 3, 4, 5, 6, 7, 8]
ints1: [8, 7, 6, 5, 4, 3, 2, 1]
*///:~
