package ch3;
import static net.mindview.util.Print.*;

public class E10 {
	public static void main(String[] args) {
		int a = 0xaaaaaaaa;
		int b = 0x55555555;
		
		print(" a :"+Integer.toBinaryString(a));
		print(" b :"+Integer.toBinaryString(b));
		print("~a :"+Integer.toBinaryString(~a));
		print("~b :"+Integer.toBinaryString(~b));
		print("a&a:"+Integer.toBinaryString(a&a));
		print("a|a:"+Integer.toBinaryString(a|a));
		print("a^a:"+Integer.toBinaryString(a^a));
		print("a&b:"+Integer.toBinaryString(a&b));
		print("a|b:"+Integer.toBinaryString(a|b));
		print("a^b:"+Integer.toBinaryString(a^b));
	}
}/* Output:
 a :10101010101010101010101010101010
 b :1010101010101010101010101010101
~a :1010101010101010101010101010101
~b :10101010101010101010101010101010
a&a:10101010101010101010101010101010
a|a:10101010101010101010101010101010
a^a:0
a&b:0
a|b:11111111111111111111111111111111
a^b:11111111111111111111111111111111
*///:~
