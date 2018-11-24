package ch10;

import static net.mindview.util.Print.print;



interface Cycle{
	public void ride();
}

interface CycleFactory{
	public Cycle getCycle();
}

class Unicycle implements Cycle{
	public void ride(){ print("Unicycle.ride()");}
	public static CycleFactory factory = new CycleFactory(){
		public Cycle getCycle(){return new Unicycle();}
	};
}

class Bicycle implements Cycle{
	public void ride(){ print("Bicycle.ride()");}
	public static CycleFactory factory = new CycleFactory(){
		public Cycle getCycle(){return new Bicycle();}
	};
}

class Tricycle implements Cycle{
	public void ride(){ print("Tricycle.ride()");}
	public static CycleFactory factory = new CycleFactory(){
		public Cycle getCycle(){return new Tricycle();}
	};
}

public class E16 {
	public static void rideCycle(CycleFactory cf){
		Cycle c = cf.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		rideCycle(Unicycle.factory);
		rideCycle(Bicycle.factory);
		rideCycle(Tricycle.factory);
	}
}/* Output:
Unicycle.ride()
Bicycle.ride()
Tricycle.ride()
*///:~