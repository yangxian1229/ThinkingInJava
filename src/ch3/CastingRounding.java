package ch3;
import static net.mindview.util.Print.*;
public class CastingRounding {

	public static void main(String[] args) {
		double above = 0.7,below = 0.4;
		float fabove = 0.7f,fbelow = 0.4f;
		print("(int)above:"+(int)above);
		print("(int)below:"+(int)below);
		print("(int)fabove:"+(int)fabove);
		print("(int)fbelow:"+(int)fbelow);
		
		print("Math.round(above):"+Math.round(above));
		print("Math.round(below):"+Math.round(below));
		print("Math.round(fabove):"+Math.round(fabove));
		print("Math.round(fbelow):"+Math.round(fbelow));
	}
}/* Output:
(int)above:0
(int)below:0
(int)fabove:0
(int)fbelow:0
Math.round(above):1
Math.round(below):0
Math.round(fabove):1
Math.round(fbelow):0
*///:~
