package ch8.music;

import static net.mindview.util.Print.*;

import java.util.Random;

class Instrument{
	void play(Note n){print("Instrument.play() "+n);}
	 //String what() {return "Instrument";}
	public String toString() {return "Instrument";}
	void adjust(){print("Adjusting Instrument");}
}

class Wind extends Instrument{
	void play(Note n){print("Wind.play() "+n);}
	//String what() {return "Wind";}
	public String toString() {return "Wind";}
	void adjust(){print("Adjusting Wind");}
}

class Percussion extends Instrument{
	void play(Note n){print("Percussion.play() "+n);}
	//String what() {return "Percussion";}
	public String toString() {return "Percussion";}
	void adjust(){print("Adjusting Percussion");}
}

class Stringed extends Instrument{
	void play(Note n){print("Stringed.play() "+n);}
	//String what() {return "Stringed";}
	public String toString() {return "Stringed";}
	void adjust(){print("Adjusting Stringed");}
}

class Brass extends Wind{
	void play(Note n){print("Brass.play() "+n);}
	//String what() {return "Brass";}
	public String toString() {return "Brass";}
}

class Woodwind extends Wind{
	void play(Note n){print("Woodwind.play() "+n);}
	//String what() {return "Woodwind";}
	public String toString() {return "Woodwind";}
}

public class Music3 {
	//Doesn't care about type, so new types added to the system still work right:
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e){
		for(Instrument i:e)
			tune(i);
	}
	public static void printAll(Instrument[] e){
		for(Instrument i:e)
			System.out.println(i.toString());
	}
	public static Instrument insGeneration(){
		Random rand = new Random();
		switch(rand.nextInt(5)){
		default:
		case 0: return new Wind();
		case 1: return new Percussion();
		case 2: return new Stringed();
		case 3: return new Brass();
		case 4: return new Woodwind();
		}
	}
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		/*Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};*/
		//tuneAll(orchestra);
		//E06
		//printAll(orchestra);
		
		//E08
		Instrument[] ins=new Instrument[10];
		for(int i=0;i<10;i++)
			ins[i] = insGeneration();
		printAll(ins);
	}
}/* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
//E06
 * Wind
Percussion
Stringed
Brass
Woodwind
*///:~