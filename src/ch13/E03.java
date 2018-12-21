package ch13;

import java.io.PrintStream;
import java.util.Formatter;

public class E03 {
	public static void main(String[] args){
		PrintStream f = System.err;
		Turtle tommy = new Turtle("Tommy",new Formatter(f));
		Turtle terry = new Turtle("Terry",new Formatter(f));
		tommy.move(0,0);
	    terry.move(4,8);
	    tommy.move(3,4);
	    terry.move(2,5);
	    tommy.move(3,3);
	    terry.move(3,3);
	}

}
