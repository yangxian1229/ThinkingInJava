//: ch3/AutoInc.java
// Demonstrates the ++ and -- operators.
package ch3;

import static net.mindview.util.Print.*;

public class AutoInc {
	public static void main(String[] args) {
		int i = 1;
		print("i = "+i);
		print("++i = "+ ++i);
		print("i++ = "+ i++);
		print("i = "+i);
		print("--i = "+ --i);
		print("i-- = "+i--);
		print("i = "+i);
	}
}/* Output:
i = 1
++i = 2
i++ = 2
i = 3
--i = 2
i-- = 2
i = 1
*///:~
