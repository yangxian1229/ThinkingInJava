package ch10;

import ch10.ch10_1.E05I;
import ch10.ch10_2.E05C;

public class E06 extends E05C{
	E05I inner(){
		return this.new Inner();
	}
	public static void main(String[] args) {
		E06 e = new E06();
		E05I in = e.inner();
		in.toPrint();
	}
}/* Output:
E10C Inner
*///:~
