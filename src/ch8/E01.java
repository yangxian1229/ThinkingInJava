package ch8;

import static net.mindview.util.Print.*;

class Cycle{
	int wheels(){return 0;}
}

class Unicycle extends Cycle{
	int wheels(){return 1;}
}

class Bicycle extends Cycle{
	int wheels(){return 2;}
}

class Tricycle extends Cycle{
	int wheels(){return 3;}
}

public class E01 {
	//static void ride(Cycle s){print(s+" ride");}
	static void ride(Cycle c){
		print("wheels: "+c.wheels());
	}
	public static void main(String[] args) {
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());	
		
	}
}/* Output:
ch8.Unicycle@15db9742 ride
ch8.Bicycle@75b84c92 ride
ch8.Tricycle@6bc7c054 ride
//E05
wheels: 1
wheels: 2
wheels: 3
*///:~