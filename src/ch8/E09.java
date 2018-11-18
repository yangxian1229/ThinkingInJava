package ch8;

import static net.mindview.util.Print.*;

class Rodent {
	public void hop() {
		print("Rodent hopping");
	}

	public void scurry() {
		print("Rodent scurrying");
	}

	public void reproduce() {
		print("Making more Rodents");
	}

	public String toString() {
		return "Rodent";
	}
}

class Mouse extends Rodent {
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

class Gerbil extends Rodent {
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

class Hamster extends Rodent {
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

public class E09 {
	public static void main(String[] args) {
		Rodent[] rodents = { new Mouse(), new Gerbil(), new Hamster() };

		for (Rodent r: rodents){
			r.hop();
			r.scurry();
			r.reproduce();
			print(r);
		}
	}
}