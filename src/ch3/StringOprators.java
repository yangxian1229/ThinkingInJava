package ch3;
import static net.mindview.util.Print.*;
public class StringOprators {
	public static void main(String[] args) {
		int x=0,y=1,z=2;
		String s = "x,y,z ";
		print(s+x+y+z);
		print(x+" "+s);//Converts to a String
		s += "(summed) = ";
		print(s + (x+y+z));
		print(""+x);//Shorthand for Integer.toString()
	}
}/* Output:
x,y,z 012
0 x,y,z 
x,y,z (summed) = 3
0
*/