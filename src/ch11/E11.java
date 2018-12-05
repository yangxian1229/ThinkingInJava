package ch11;

import java.util.*;

public class E11 {
	public static void printToString(Iterator<?> it){
		while(it.hasNext())
			System.out.print(it.next().toString()+" ");
	}
	public static void main(String[] args) {
		List<Collection<String>> ca = Arrays.<Collection<String>>asList(
				new ArrayList<String>(),
				new LinkedList<String>(),
				new HashSet<String>(),
				new TreeSet<String>());
		for(Collection<String> c:ca)
			E04.fill(c);
		for(Collection<String> c:ca){
			printToString(c.iterator());
			System.out.println();
		}

	}

}
