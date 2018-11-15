package ch7;

import static net.mindview.util.Print.print;

public class E24 extends Beetle{
	private int k1 = printInit("E24.k initialized");
	public E24(){
		print("k1="+k1);
		print("j="+j);
	}
	private static int x3 =printInit("static E20.x3 initialized");

	public static void main(String[] args) {
		print("E24 constructor***");
		new E24();
	}
}/* Output:
static Insect.x1 initialized
static Beetle.x2 initialized
static E20.x3 initialized
E24 constructor
i=9 ,j=0
Beetle.k initialized
k=47
j=39
E24.k initialized
k1=47
j=39

*/
