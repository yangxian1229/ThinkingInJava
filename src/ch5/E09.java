package ch5;

import static net.mindview.util.Print.*;

//改书中Flower例子
public class E09 {
	int petalCount = 0;
	String s = "initial value";
	E09(int petals){
		petalCount = petals;
		print("Constructor w/ int arg only, petalCount= "+petalCount);
	}
	E09(String ss){
		print("Constructor w/ String arg only, s= "+ss);
		s=ss;
	}
	E09(String s, int petals){
		this(petals);
	//! this(s); //Can't call two!
		this.s = s; //Another use of "this"
		print("String & int args");
	}
	E09(){
		this("hi",47);
		print("default constructor (no args)");
	}
	void printPetalCount(){
	//! this(11);//Not inside non-constructor!
		print("petalCount = "+petalCount+" s = "+s);
	}
	public static void main(String[] args) {
		E09 e09 = new E09();
		e09.printPetalCount();
	}
}/* Output:
Constructor w/ int arg only, petalCount= 47
String & int args
default constructor (no args)
petalCount = 47 s = hi
*///:~
