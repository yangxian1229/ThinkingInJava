package ch9;

interface StaticFinalTest{
	String RED = "red";
}

class E17Test implements StaticFinalTest{
	public E17Test(){
		//cannot assign a value to final variable RED:
		//! RED = "blue";
	}
}

public class E17 {
	public static void main(String[] args) {
		// Accessing as a static field:
		System.out.println("StaticFinalTest.RED = "+
		StaticFinalTest.RED);
	}
}/* Output:
StaticFinalTest.RED = red
*///:~
