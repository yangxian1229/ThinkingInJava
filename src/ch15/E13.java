package ch15;

import java.util.*;

import ch15.coffee.Coffee;
import ch15.coffee.CoffeeGenerator;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

public class E13 {
	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}

	public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			list.add(gen.next());
		return list;
	}

	public static <T> Queue<T> fill(Queue<T> queue, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			queue.add(gen.next());
		return queue;
	}

	public static <T> LinkedList<T> fill(LinkedList<T> llist, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			llist.add(gen.next());
		return llist;
	}

	public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			set.add(gen.next());
		return set;
	}

	public static void main(String[] args) {
		List<Coffee> coffeeList = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		for (Coffee c : coffeeList)
			System.out.println(c);
		Queue<Integer> iQueue = fill((Queue<Integer>) new LinkedList<Integer>(), new Fibonacci(), 12);
		for (int i : iQueue)
			System.out.print(i + " ");
		System.out.println();
		LinkedList<Character> cLList = fill(new LinkedList<Character>(), new CountingGenerator.Character(), 12);
		for (char ch : cLList)
			System.out.print(ch);
		System.out.println();
		Set<Boolean> bSet = fill(new HashSet<Boolean>(), new CountingGenerator.Boolean(), 10);
		for (Boolean b : bSet)
			System.out.println(b);
	}

}
