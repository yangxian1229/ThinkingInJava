package ch11;

import java.util.*;

public class E28 {
	public static void main(String[] args) {
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		Random rand = new Random(47);
		for(int i=0;i<10;i++)
			pq.offer(rand.nextDouble());
		
		while(pq.peek()!=null) {
			System.out.println(pq.remove() + " ");
		}
		
	}

}
