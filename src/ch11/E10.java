package ch11;

import static net.mindview.util.Print.print;

import java.util.*;

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

class Gerbil10 extends Rodent {
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

public class E10 {
	public static void main(String[] args) {
		List<Rodent> rodents = new ArrayList<Rodent>(
				Arrays.asList(
						new Rodent(), new Mouse(), new Hamster()));
		Iterator<Rodent> it = rodents.iterator();
		Rodent r;
		while(it.hasNext()){
			r  = it.next();
			r.hop();
			r.scurry();
			r.scurry();
			r.reproduce();
			print(r);
		}

	}

}
