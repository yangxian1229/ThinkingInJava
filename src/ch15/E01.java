package ch15;

import ch15.pets.Mouse;
import ch15.pets.Pet;

public class E01 {
	public static void main(String[] args) {
		Holder3<Pet> h3 = new Holder3<Pet>(new Mouse("Mickey"));
		System.out.println(h3.get());

	}

}
