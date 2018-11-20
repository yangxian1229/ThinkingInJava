package ch9;

import static net.mindview.util.Print.print;

interface Rodent1 {
	 public void hop();
	 public void scurry();
	 public void reproduce();
}
class Mouse1 implements Rodent1 {
	public void hop() {
		print("Mouse hopping");
	}

	public void scurry() {
		print("Mouse scurrying");
	}

	public void reproduce() {
		print("Making more Mice");
	}

	public String toString() {
		return "Mouse";
	}
}

class Gerbil1 implements Rodent1 {
	public void hop() {
		print("Gerbil hopping");
	}

	public void scurry() {
		print("Gerbil scurrying");
	}

	public void reproduce() {
		print("Making more Gerbils");
	}

	public String toString() {
		return "Gerbil";
	}
}

class Hamster1 implements Rodent1 {
	public void hop() {
		print("Hamster hopping");
	}

	public void scurry() {
		print("Hamster scurrying");
	}

	public void reproduce() {
		print("Making more Hamsters");
	}

	public String toString() {
		return "Hamster";
	}
}
public class E07 {
	public static void main(String[] args) {
		Rodent1[] rs = {new Mouse1(),new Gerbil1(),new Hamster1()};
		for(Rodent1 r:rs){
			r.hop();
			r.scurry();
			r.reproduce();
			r.toString();
		}
	}
}
