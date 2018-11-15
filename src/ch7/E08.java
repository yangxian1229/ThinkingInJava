package ch7;

import static net.mindview.util.Print.print;

class Ha{
	public Ha(String s) {
		print("Ha "+s);
	}
}

public class E08 extends Ha{
	E08(){
		super("no args ");
		print("E08");
	}
	E08(String s){
		super(s);
		print("String args ");
	}
	public static void main(String[] args) {
		new E08();
		new E08("HeiHei");

	}
}/* Output:
Ha no args 
E08
Ha HeiHei
String args 
*///:~
