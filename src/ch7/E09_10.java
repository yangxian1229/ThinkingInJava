package ch7;

import static net.mindview.util.Print.print;

import net.mindview.util.New;

class Component1{
	public Component1() { print("Component1 no args");}
}
class Component2{
	public Component2() { print("Component2 no args");}
}
class Component3{
	public Component3() { print("Component3 no args");}
}

class Root{
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
	//public Root(){ print("Root no args");}
	public Root(String s){ print(s+" Root String args");}
}

class Stem extends Root{
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
	//public Stem(){ print("Stem no args");}
	public Stem(String s){ 
		super(s);
		print(s+" Stem String args");
	}
}

public class E09_10 {
	public static void main(String[] args) {
		//new Stem();
		new Stem("Haaaa");

	}

}/* Output:
//E09:
Component1 no args
Component2 no args
Component3 no args
Root no args
Component1 no args
Component2 no args
Component3 no args
Stem no args
//E10
 Component1 no args
Component2 no args
Component3 no args
Haaaa Root String args
Component1 no args
Component2 no args
Component3 no args
Haaaa Stem String args 
*/
