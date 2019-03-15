package ch21;

import java.util.*;
import java.util.concurrent.*;

import net.mindview.util.Generator;

class Fibonacci1 implements Generator<Integer>, Callable<Integer> {
	private int count;
	private final int n;
	public Fibonacci1(int n) { this.n = n; }
	private int fib(int n) {
		if(n < 2) return 1;
		return fib(n-2) + fib(n-1);
	}
	public Integer call(){
		int sum = 0;
		for(int i=0;i<n;i++)
			sum += next();
		return sum;
	}
	@Override
	public Integer next() {
		
		return fib(count++);
	}
	
}

public class E05 {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<Integer>> results = new ArrayList<Future<Integer>>();
		for(int i = 1; i<=5;i++)
			results.add(exec.submit(new Fibonacci1(i)));
		Thread.yield();
		exec.shutdown();
		for(Future<Integer> fs : results)
			try {
				System.out.println(fs.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
