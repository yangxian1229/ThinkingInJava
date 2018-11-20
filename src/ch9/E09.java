package ch9;

import ch8.music.Note;
import static net.mindview.util.Print.*;

abstract class Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public void adjust() {
		print(this + ".adjust()");
	}
}

class Wind extends Instrument {
	public String toString() {
		return "Wind";
	}
}

class Percussion extends Instrument {
	public String toString() {
		return "Percussion";
	}
}

class Stringed extends Instrument {
	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}

public class E09 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}/* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
