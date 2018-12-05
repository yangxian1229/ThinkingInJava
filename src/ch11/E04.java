package ch11;

import java.util.*;

class Generation{
	private String[] moves = {"Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy",
			"Bashful", "Snow White", "Witch Queen", "Prince"};
	public String[] getMoves(){
		return moves;
	}
	private int next=0;
	public String nextMove(){
		String m = moves[next];
		next = (next+1)%(moves.length);
		return m;
	}
}

public class E04 {
	static Generation g = new Generation();
	static Collection fill(Collection<String> collection){
		for(int i=0;i<5;i++){
			collection.add(g.nextMove());
		}
		return collection;
	}
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList()));
		System.out.println(fill(new LinkedList()));
		System.out.println(fill(new HashSet()));
		System.out.println(fill(new LinkedHashSet()));
		System.out.println(fill(new TreeSet()));
	}
}/* Output:
[Grumpy, Happy, Sleepy, Dopey, Doc]
[Sneezy, Bashful, Snow White, Witch Queen, Prince]
[Sleepy, Happy, Grumpy, Doc, Dopey]
[Sneezy, Bashful, Snow White, Witch Queen, Prince]
[Doc, Dopey, Grumpy, Happy, Sleepy]
*///:~
