package ch7;

import static net.mindview.util.Print.print;

class E13A{
	public void A(int i){print("int arg "+i);}
	public void A(String s){print("String arg "+s);}
	public void A(char c){print("char arg "+c);}
}

public class E13 extends E13A{
	public void A(int i,String s){
		print("int and String args "+i+s);
	}
	public static void main(String[] args) {
		E13 e13 = new E13();
		e13.A(1);
		e13.A("HaHa");
		e13.A('H');
		e13.A(2, "HeiHei");
	}
}/* Output:
int arg 1
String arg HaHa
char arg H
int and String args 2HeiHei
*///:~
