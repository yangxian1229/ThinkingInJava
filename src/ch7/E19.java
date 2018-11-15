package ch7;

import static net.mindview.util.Print.*;

class A11{
	A11(int i){print("A11: "+i);}
}
class B11{
	private final A11 a;
	public B11(){
		a = new A11(222);
	}
	public B11(int i){
		a = new A11(i);
		print("B11: "+i);
	}
	public B11(String s){
		a = new A11(111);
		print("B11: "+s);
	}
	
}

public class E19 {
	public static void main(String[] args) {
		B11 b11 = new B11(12);
		B11 b111 = new B11("HAHA");
		B11 b22 = new B11();
	}
}
