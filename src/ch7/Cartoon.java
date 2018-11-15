package ch7;

import static net.mindview.util.Print.print;

class Art{
	public Art() { print("Art constructor");}
}
class Drawing extends Art{
	public Drawing() { print("Drawing constructor");}
}

public class Cartoon extends Drawing{
	public Cartoon(){ print("Cartoon constructor");}
	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
}/* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~