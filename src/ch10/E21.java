package ch10;

import ch10.E21I.E21C;

interface E21I{
	void f();
	void g();
	
	class E21C{
		static void makeS(E21I ei){
			System.out.print("E21C.f(): ");
			ei.f();
			System.out.print("E21C.g(): ");
			ei.g();
		}
	}
}



public class E21 {
	public static void main(String[] args) {
		E21I ei = new E21I(){
			public void f(){System.out.println("E21 f()");}
			public void g(){System.out.println("E21 g()");}
		};
		new E21I.E21C().makeS(ei);
	}
}/* Output:
E21C.f(): E21 f()
E21C.g(): E21 g()
*///:~
