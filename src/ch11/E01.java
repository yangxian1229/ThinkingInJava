package ch11;

import java.util.*;

class Gerbil {
	private final int gerbilNumber;

	Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}

	public String toString() {
		return "gerbil " + gerbilNumber;
	}

	public void hop() {
		System.out.println(this + " is hopping");
	}
}

public class E01 {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList();
		for(int i = 0;i<3;i++)
			gerbils.add(new Gerbil(i));
		for(int i=0;i<gerbils.size();i++){
			Gerbil g = gerbils.get(i);
			g.hop();
		}
	}
}/* Output:
gerbil 0 is hopping
gerbil 1 is hopping
gerbil 2 is hopping
*///:~
