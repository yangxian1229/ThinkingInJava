package ch6;

import ch6_1.E04_1;

public class E04_2 extends E04_1{
	public E04_2(){
		System.out.println("E04_2 constructor");
	}
	public void e04Test2(){
		e04Test();
	}

	public static void main(String[] args) {
		E04_2 e04_2  = new E04_2();
		e04_2.e04Test2();

	}
}/* Output:
E04_1 constructor
E04_2 constructor
e04Test
*///:~
