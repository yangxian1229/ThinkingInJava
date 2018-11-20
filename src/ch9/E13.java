package ch9;

interface E13A{
	void f();
}

interface E13B1 extends E13A{
	void f();
}

interface E13B2 extends E13A{
	void f();
}
interface E13C extends E13B1,E13B2{
	void f();
}

public class E13 implements E13C{
	public void f(){
		System.out.println(this+" f()");
	}
	public static void main(String[] args) {
		E13 e = new E13();
		e.f();
	}
}///:~

//—È÷§£∫
class A1{
	void f(){
		System.out.println("A1: f()");
	}
}

interface A2{
	void f();
}

class B1{
	void f(){
		System.out.println("B1: f()");
	}
}

class C1 extends A1 implements A2{	
	public void f(){
		System.out.println("C1: f()");
	}
}
