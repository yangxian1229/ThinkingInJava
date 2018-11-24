package ch10;

class Outer{
	class Inner{
		Inner(){System.out.println("Inner");}
		void hi(){System.out.println("Inner hi");}
	}
	public Inner toInner(){
		return new Inner();
	}
}

public class E01 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner  oi = o.toInner();
		oi.hi();
	}
}/* Output:
Inner
Inner hi
*///:~
