package ch7;

import static net.mindview.util.Print.print;

class LoadTest{
	//The static clause is executed upon class loading:
	static{
		print("Loading LoadTest");
	}
	static void staticMember(){}
}

public class E23 {
	public static void main(String[] args) {
		print("Creating an object");
		new LoadTest();
		print("Calling static member");
		LoadTest.staticMember();
	}
}/* Output:
Creating an object
Loading LoadTest
Calling static member
*///£»~
