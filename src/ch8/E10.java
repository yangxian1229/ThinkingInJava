package ch8;

import static net.mindview.util.Print.*;

class E10A{
	public void a(){print("E10A.a():"+b());}
	public String b(){return "E10A.b()";}
}

class E10B extends E10A{
	public String b(){return "E10B.b()";}
}

public class E10 {
	public static void main(String[] args) {
		E10B eb = new E10B();
		eb.a();
		
	}
}/* Output:
E10A.a():E10B.b()
*///:~
