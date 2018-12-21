package ch15;

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

public class E06 {
	private static void dump(RandomList<?> rl){
		for(int i = 0;i<11;i++)
			 System.out.print(rl.select() + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		 RandomList<String> rs = new RandomList<String>();
		 for(String s: ("The quick brown fox jumped over " +
		        "the lazy brown dog").split(" "))
		    	rs.add(s);
		 dump(rs);
		    
		 RandomList<Integer> ri = new RandomList<Integer>();
		 Integer[] is =  {1,2,3,4,5,6,7,8,9,10};
		 for(Integer i : is)
			 ri.add(i);
		 dump(ri);
		 
		 RandomList<Character> rc = new RandomList<Character>();
		 Generator<Character> gc = new CountingGenerator.Character();
		 for(int i = 0; i < 11; i ++)
		 rc.add(gc.next());
		 dump(rc);

	}

}
