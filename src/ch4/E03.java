package ch4;

import java.util.Random;

public class E03 {
	static Random r = new Random(47);
	public static void compareRand() {
		int a = r.nextInt();
		int b = r.nextInt();
		System.out.println("a = " + a + ", b = " + b);
		if(a < b)
			System.out.println("a < b");
		else if(a > b)
			System.out.println("a > b");
		else
			System.out.println("a = b");
	}
	public static void main(String[] args) {
		while(true){
			compareRand();
		}

	}

}
