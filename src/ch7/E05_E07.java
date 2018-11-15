package ch7;

import static net.mindview.util.Print.print;

import net.mindview.util.New;

class A{
	public A(){print("A");}
	public A(String s){print("A1"+s);}
}
class B{
	public B(){print("B");}
	public B(String s){
		print("B1"+s);
	}
}
class C extends A{
	public C(){}
	public C(String s) {
		super(s);
		print("C1"+s);
	}

	B b  =  new B("HAHAHA");
}

public class E05_E07 {
	public static void main(String[] args) {
		//sC c1 = new C();
		C c = new C("heihei");
	}

}/* Output:
A1heihei
B1HAHAHA
C1heihei
*///:~
