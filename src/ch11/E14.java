package ch11;

import java.util.*;

public class E14 {
	public static void main(String[] args) {
		LinkedList<Integer> ints = new LinkedList<Integer>();
		ListIterator<Integer> lit = ints.listIterator();
		for(int i=0;i<10;i++) {
			lit.add(i);
			if(i % 2 == 0)
				lit.previous();
		}
		System.out.println(ints);
	}
}/* Output:
[1, 3, 5, 7, 9, 8, 6, 4, 2, 0]
*///:~
