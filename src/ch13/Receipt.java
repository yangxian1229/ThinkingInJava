package ch13;

import java.util.*;

public class Receipt {
	private final static int WIDTH_1 = 15;
	private final static int WIDTH_2 = 5;
	private final static int WIDTH_3 = 10;
	
	private double total = 0;
	private Formatter f = new Formatter(System.out);

	public void printTitle() {
		f.format("%-" + WIDTH_1+ "s %" + WIDTH_2 + "s %" + WIDTH_3 + "s\n", "Item", "Qty", "Price");
		f.format("%-" + WIDTH_1+ "s %" + WIDTH_2 + "s %" + WIDTH_3 + "s\n", "----", "---", "-----");
	}

	public void print(String name, int qty, double price) {
		f.format("%-" + WIDTH_1+ ".15s %" + WIDTH_2 + "d %" + WIDTH_3 + ".2f\n",  name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format("%-" + WIDTH_1+ ".15s %" + WIDTH_2 + "s %" + WIDTH_3 + ".2f\n","Tax", "", total * 0.06);
		f.format("%-" + WIDTH_1+ "s %" + WIDTH_2 + "s %" + WIDTH_3 + "s\n",  "", "", "-----");
		f.format("%-" + WIDTH_1+ "s %" + WIDTH_2 + "s %" + WIDTH_3 + ".2f\n","Total", "", total * 1.06);
	}

	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
} /*
	 * Output: Item Qty Price ---- --- ----- Jack's Magic Be 4 4.25 Princess
	 * Peas 3 5.10 Three Bears Por 1 14.29 Tax 1.42 ----- Total 25.06
	 */// :~
