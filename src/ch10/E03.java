package ch10;


class Outer1{
	private String s;
	Outer1(String ss){
		s = ss;
	}
	class Inner{
		Inner(){System.out.println("Inner");}
		public String toString(){
			return s;
		}
	}
	public Inner toInner(){
		return new Inner();
	}
}

public class E03 {
	public static void main(String[] args) {
		Outer1 o1 = new Outer1("nihao");
		Outer1.Inner oi1 = o1.toInner();
		System.out.println(oi1.toString());
	}
}/* Output:
Inner
nihao
*///:~
