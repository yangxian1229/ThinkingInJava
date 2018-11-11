package ch3;

import static net.mindview.util.Print.*;

public class E14 {
	public static void p(String s, boolean b) {
		System.out.println(s + ": " + b);
	}
	static void compare(String l,String r ){
		print("l:"+l+" r:"+r);
		p("l == r" , l==r);
		p("l != r" , l!=r);
		p("l.equals(r)" , l.equals(r));
	}
	public static void main(String[] args) {
		compare("Hello","Hello");
		
		String s = new String("Hello");
		compare("Hello", s);
		compare("Hello", "Goodbye");
	}
}/* Output:
l:Hello r:Hello
l == r: true
l != r: false
l.equals(r): true
l:Hello r:Hello
l == r: false
l != r: true
l.equals(r): true
l:Hello r:Goodbye
l == r: false
l != r: true
l.equals(r): false
*///:~
