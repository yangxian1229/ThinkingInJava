package ch5;

import org.omg.CORBA.SystemException;

public class E14 {
	static String s1 = "HAHAHA";
	static String s2;
	static {
		s2 = "heiheihei";
	}
	static void printString(){
		System.out.println(s1+"  "+s2);
	}
	public static void main(String[] args) {
		printString();
	}

}/* Output:
HAHAHA  heiheihei
*///:~
