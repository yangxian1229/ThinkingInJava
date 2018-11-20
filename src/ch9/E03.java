package ch9;

abstract class E03A{
	abstract void print();
	E03A(){
		System.out.print("E03A: ");
		print();
	}
}

class E03B extends E03A{
	private int b = 22;
	void print(){
		System.out.println("b="+b);
	}
	E03B(){
		super();
		System.out.print("E03B: ");
		print();
	}
}

public class E03 {
	public static void main(String[] args) {
		E03B eb = new E03B();
	}
}/* Output:
E03A: b=0
E03B: b=22
*///:~