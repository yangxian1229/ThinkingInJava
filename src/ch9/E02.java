package ch9;

import static net.mindview.util.Print.*;

abstract class E02A{
	public void hello(){
		print("E02A Hello");
	}
}

class E02B extends E02A{
	public void hi(){
		print("E02B hi");
	}
}

public class E02 {
	public static void main(String[] args) {
		//E02A ea = new E02A();
		//ea.hello();
		E02A eb = new E02B();
		eb.hello();
		//eb.hi();
	}
}/* Output:
E02A Hello
*///:~
