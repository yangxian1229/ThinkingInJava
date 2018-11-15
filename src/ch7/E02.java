package ch7;

import static net.mindview.util.Print.print;

public class E02 extends Detergent{
	public void scrub(){
		append(" E02.scrub()");
		super.scrub();//Call base-class version
	}
	public void sterilize(){
		append(" sterilize()");
	}
	public static void main(String[] args) {
		E02 x = new E02();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.sterilize();
		print(x);
	}
}/* Output:
Cleanser dilute() apply() E02.scrub() Detergent.scrub() scrub() foam() sterilize()
*///:~
