package ch8;

import static net.mindview.util.Print.*;

class Cycle1{
	int wheels(){return 0;}
}

class Unicycle1 extends Cycle1{
	int wheels(){return 1;}
	void balance(){print("Unicycle1 balance");}
}

class Bicycle1 extends Cycle1{
	int wheels(){return 2;}
	void balance(){print("Bicycle1 balance");}
}

class Tricycle1 extends Cycle1{
	int wheels(){return 3;}
}

public class E17 {
	public static void main(String[] args) {
		Cycle1[] c1 = {new Unicycle1(),new Bicycle1(),new Tricycle1()};
		//! c1[0].balance();
		//! c1[1].balance();
		//! c1[2].balance();
		((Unicycle1)c1[0]).balance();
		((Bicycle1)c1[1]).balance();
		//! ((Tricycle1)c1[2]).balance();

	}

}
