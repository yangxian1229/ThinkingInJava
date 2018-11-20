//Order of constructor calls.
package ch9;

import static net.mindview.util.Print.*;

interface FastFood{
	public void eat();
}

class Meal {
	Meal() { print("Meal()"); }
}

class Bread {
	Bread() { print("Bread()"); }
}

class Cheese {
	Cheese() { print("Cheese()"); }
}

class Lettuce {
	Lettuce() { print("Lettuce()"); }
}

class Lunch extends Meal {
	Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
	PortableLunch() { print("PortableLunch()");}
}

class Sandwich extends PortableLunch implements FastFood {
	public Sandwich() { print("Sandwich()"); }
	public void eat(){print("eat Sandwich");}
} 

public class E08 {
	public static void main(String[] args) {
		Sandwich sandwich = new Sandwich();
		sandwich.eat();

	}

}
