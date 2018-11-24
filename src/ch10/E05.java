package ch10;

import ch10.E05A.Inner;

class E05A{
	public class Contents{
		Contents(){System.out.println("Contents");}
	}
	static class Inner{
		Inner(){System.out.println("Inner");}
	}
}

public class E05 {
	public static void main(String[] args) {
		E05A ea = new E05A();
		E05A.Contents ec = ea.new Contents();
		//static innerclass
		E05A.Inner ei = new Inner();
	}
}/* Output:
Contents
Inner
*///:~
