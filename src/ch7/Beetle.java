package ch7;

import static net.mindview.util.Print.print;

class Insect{
	private int i=9;
	protected int j;
	Insect() {
		print("i="+i+" ,j="+j);
		j = 39;
	}
	static int printInit(String s){
		print(s);
		return 47;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
}

public class Beetle extends Insect{
	private int k = printInit("Beetle.k initialized");
	public Beetle(){
		print("k="+k);
		print("j="+j);
	}
	private static int x2 =printInit("static Beetle.x2 initialized");
	public static void main(String[] args) {
		print("Beetle constructor");
		Beetle beetle = new Beetle();
	}
}/* Output:
static Insect.x1 initialized
static Beetle.x2 initialized
Beetle constructor
i=9 ,j=0
Beetle.k initialized
k=47
j=39
*///£º~
