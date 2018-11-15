package ch7;

import static net.mindview.util.Print.*;

class WithFinals{
	//Identical to "private" alone:
	private final void f(){ print("WithFinal.f()");}
	//Also automatical "final"
	private void g(){print("WithFinals.g()");}
}

class OverridingPrivate extends WithFinals{
	private final void f() {print("OverridingPrivate.f()");}
	private void g(){print("OverridingPrivate.g()");}
}

class OverrigingPrivate2 extends OverridingPrivate{
	public final void f() {print("OverridingPrivate2.f()");}
	public void g(){print("OverridingPrivate2.g()");}
}

public class FinalOverridingIllusion {

	public static void main(String[] args) {
		OverrigingPrivate2 op2 = new OverrigingPrivate2();
		op2.f();
		op2.g();
		// You can upcast:
		OverridingPrivate op = op2;
		// But you can't call the methods:
		//! op.f();
		//! op.g();
		WithFinals wf = op2;
		//! wf.f();
		//! wf.g();
	}
}/* Output:
OverridingPrivate2.f()
OverridingPrivate2.g()
*///:~
