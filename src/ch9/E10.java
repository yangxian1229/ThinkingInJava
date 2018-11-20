package ch9;

import ch8.music.Note;
import static net.mindview.util.Print.*;

interface Instrument1 {
	public void adjust();
}

interface Playable {
	public void play(Note n);
}

class Wind1 implements Instrument1, Playable {
	public void adjust() {
		print(this + ".adjust()");
	}
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public String toString() {
		return "Wind";
	}
}

class Percussion1 implements Instrument1, Playable {
	public void adjust() {
		print(this + ".adjust()");
	}
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}
}

class Stringed1 implements Instrument1, Playable {
	public void adjust() {
		print(this + ".adjust()");
	}
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}
}

class Brass1 extends Wind1 {
	public String toString() {
		return "Brass";
	}
}

class Woodwind1 extends Wind1 {
	public String toString() {
		return "Woodwind";
	}
}

public class E10 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	static void tune(Playable p) {
		// ...
		p.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] ps) {
		for (Playable p:ps)
			tune(p);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] ps = { new Wind1(), new Percussion1(), new Stringed1(), new Brass1(), new Woodwind1() };
		tuneAll(ps);
	}
}/* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
