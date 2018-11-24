package ch10;

class E26A{
	class E26B{
		E26B(int i){
			System.out.println("E26B");
		}
	}
}

public class E26 extends E26A.E26B{
	E26(E26A ea){
		ea.super(1);
		System.out.print("E26");
	}
	public static void main(String[] args) {
		E26 e = new E26(new E26A());
	}
}/* Output:
E26B
E26
*///:~
