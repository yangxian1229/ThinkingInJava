package ch9;

import static net.mindview.util.Print.*;

interface Cycle{
	public void ride();
}

interface CycleFactory{
	public Cycle getCycle();
}

class Unicycle implements Cycle{
	public void ride(){ print("Unicycle.ride()");}
}

class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){return new Unicycle();}
}

class Bicycle implements Cycle{
	public void ride(){ print("Bicycle.ride()");}
}

class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){return new Bicycle();}
}

class Tricycle implements Cycle{
	public void ride(){ print("Tricycle.ride()");}
}

class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){return new Tricycle();}
}

public class E18 {
	public static void rideCycle(CycleFactory cf){
		Cycle c = cf.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());

	}

}
