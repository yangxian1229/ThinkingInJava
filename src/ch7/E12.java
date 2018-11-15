package ch7;

import static net.mindview.util.Print.print;

class Component1c{
	public Component1c() { print("Component1c no args");}
	public void dispose(){print("Component1c dispose");}
}
class Component2c{
	public Component2c() { print("Component2c no args");}
	public void dispose(){print("Component2c dispose");}
}
class Component3c{
	public Component3c() { print("Component3c no args");}
	public void dispose(){print("Component3c dispose");}
}

class Rootc{
	Component1c c1 = new Component1c();
	Component2c c2 = new Component2c();
	Component3c c3 = new Component3c();
	public Rootc(String s){ print(s+" Rootc String args");}
	public void dispose(){
		print("Rootc dispose");
		c3.dispose();
		c2.dispose();
		c1.dispose();
	}
}

class Stemc extends Rootc{
	Component1c c1 = new Component1c();
	Component2c c2 = new Component2c();
	Component3c c3 = new Component3c();
	public Stemc(String s){ 
		super(s);
		print(s+" Stem String args");
	}
	public void dispose(){
		print("Stemc dispose");
		c3.dispose();
		c2.dispose();
		c1.dispose();
		super.dispose();
	}
}

public class E12 {
	public static void main(String[] args) {
		new Stemc("Haha").dispose();
	}
}/* Output:
Component1c no args
Component2c no args
Component3c no args
Haha Rootc String args
Component1c no args
Component2c no args
Component3c no args
Haha Stem String args
Stemc dispose
Component3c dispose
Component2c dispose
Component1c dispose
Rootc dispose
Component3c dispose
Component2c dispose
Component1c dispose
*///:~