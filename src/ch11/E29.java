package ch11;

import java.util.*;

class Dummy {}

public class E29 {
	public static void main(String[] args) {
		PriorityQueue<Dummy> priorityQueue =
		new PriorityQueue<Dummy>();
		System.out.println("Adding 1st instance...");
		priorityQueue.offer(new Dummy());
		System.out.println("Adding 2nd instance...");
		priorityQueue.offer(new Dummy());
	}

}
