package ch8;

import static net.mindview.util.Print.print;

class Member2{
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public void addRef(){refcount++;}
	protected void dipose(){
		if(--refcount == 0)
			print("Dispose Memeber "+this);
	}
	public void finalize(){
		if(refcount != 0)
			print("Error: object is not properly cleaned-up!");
	}
	public Member2(String s){
		print("Member2 "+s+" "+id);
	}
	public String toString() {
		return "Member2 " + id;
	}
}

class Rodent2 {
	private static long counter = 0;
	private final long id = counter++;
	private Member2 m;
	public Rodent2(Member2 m){
		this.m = m;
		this.m.addRef();
		print("Rodent2 construction: "+this.m);
	}
	public void dispose(){
		print("dispose Rodent2 "+ this);
		this.m.dipose();
	}
	public void hop() {
		print("Rodent2 hopping");
	}

	public void scurry() {
		print("Rodent2 scurrying");
	}

	public void reproduce() {
		print("Making more Rodent2s");
	}

	public String toString() {
		return "Rodent2 " + id;
	}
}

class Mouse2 extends Rodent2 {
	private static long counter = 0;
	private final long id = counter++;
	public Mouse2(Member2 m){
		super(m);
		print("Mouse2 constructor: "+ this +" "+m);
	}
	public void dispose(){
		print("dispose Mouse2 "+ this);
		super.dispose();
	}
	public void hop() {
		print("Mouse2 hopping");
	}

	public void scurry() {
		print("Mouse2 scurrying");
	}

	public void reproduce() {
		print("Making more Mice2");
	}

	public String toString() {
		return "Mouse2 " + id;
	}
}

public class E14 {
	public static void main(String[] args) {
		Member2 m2 = new Member2("m1");
		Mouse2 mouse0 = new Mouse2(m2);
		Mouse2 mouse1 = new Mouse2(m2);
		//Mouse2 mouse2 = new Mouse2(m2);
		mouse0.dispose();
		mouse1.dispose();
	}
}/* Output:
Member2 m1 0
Rodent2 construction: Member2 0
Mouse2 constructor: Mouse2 0 Member2 0
Rodent2 construction: Member2 0
Mouse2 constructor: Mouse2 1 Member2 0
dispose Mouse2 Mouse2 0
dispose Rodent2 Mouse2 0
dispose Mouse2 Mouse2 1
dispose Rodent2 Mouse2 1
Dispose Memeber Member2 0
*///:~
