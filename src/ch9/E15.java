package ch9;

import static net.mindview.util.Print.*;

abstract class Abstract{
	String s;
	public Abstract(String s){this.s = s;}
	abstract void af();
}

class E15Test extends Abstract implements D{
	E15Test(){ super("E15Test");}
	public void af(){
		print("E15Test.af()");
	}
	
	public void a1() {}
	public void a2() {}

	public void b1() {}
	public void b2() {}

	public void c1() {}
	public void c2() {	}

	public void d1() {}
}

public class E15 {
	static void u(A a){
		a.a1();
		a.a2();
	}
	static void v(B b){
		b.b1();
		b.b2();
	}
	static void w(C c){
		c.c1();
		c.c2();
	}
	static void x(D d){
		d.d1();
	}
	static void y(Abstract ab){
		ab.af();
	}
	public static void main(String[] args) {
		E15Test e = new E15Test();
		u(e);
		v(e);
		w(e);
		x(e);
		y(e);
	}
}/* Output:
E15Test.af()
*///:~
