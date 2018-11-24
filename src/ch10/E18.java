package ch10;

interface E18I {
	public void print();
}

class E18A {
	static E18I getE18I() {
		return new E18I() {
			public void print() {
				System.out.println("E18A E18I");
			}
		};
	}
}

public class E18 {
	public static void main(String[] args) {
		E18A ea = new E18A();
		ea.getE18I().print();
	}

}/* Output:
E18A E18I
*///:~
