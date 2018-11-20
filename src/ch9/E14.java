package ch9;

interface A{
	void a1();
	void a2();
}

interface B{
	void b1();
	void b2();
}

interface C{
	void c1();
	void c2();
}

interface D extends A,B,C{
	void d1();
}

class E{
	void e1(){};
}

class F extends E implements D{
	public void a1() {}
	public void a2() {}

	public void b1() {}
	public void b2() {}

	public void c1() {}
	public void c2() {	}

	public void d1() {}
	
}

public class E14 {
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
	static void y(E e){
		e.e1();
	}

	public static void main(String[] args) {
		F f = new F();
		u(f);
		v(f);
		w(f);
		x(f);
		y(f);
	}
}///:~
