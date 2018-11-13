package ch5;

import static net.mindview.util.Print.*;

class Tank{
	static int count;
	int id = count++;
	boolean full;
	public Tank(){
		print("Tank "+id+" is created.");
		full = true;
	}
	public void empty(){
		full = false;
	}
	protected void finalize(){
		if(full)
			print("Error : Tank "+id+" must be empty at cleanup.");
		else
			print("Tank "+id+" cleaned up ok.");
	}
	public String toString(){
		return "Tank "+id;
	}
}

public class E12 {
	public static void main(String[] args) {
		new Tank().empty();
		//Don't empty the seconed one
		new Tank();
		System.gc();
		System.runFinalization();
	}
}/* Output:
Tank 0 is created.
Tank 1 is created.
Tank 0 cleaned up ok.
Error : Tank 1 must be empty at cleanup.
*///:~
