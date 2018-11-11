package ch3;

import java.util.Random;

public class E07_CoinFlipping {
	public static void main(String[] args) {
		Random rand = new Random();
		boolean flip = rand.nextBoolean();
		System.out.print("Outcome:");
		System.out.println(flip ? "HEAD":"TAIL");
	}
}
