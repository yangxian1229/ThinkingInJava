package ch3;
import static net.mindview.util.Print.*;

public class E08_LongLiterals {
	public static void main(String[] args) {
		long l1 = 0x22al;
		print("l1:"+Long.toBinaryString(l1));
		long l2 = 0X22AL;
		print("l2:"+Long.toBinaryString(l2));
		long l3 = 077l;
		print("l3:"+Long.toBinaryString(l3));

	}
}/* Output:
l1:1000101010
l2:1000101010
l3:111111
*/
