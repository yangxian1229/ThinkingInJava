package ch7;

import static net.mindview.util.Print.print;


public class E11 extends Cleanser{
	private Cleanser cleanser = new Cleanser();
	public void append(String a){cleanser.append(a);}
	public void dilute() { cleanser.dilute();}
	public void apply() { cleanser.apply();}
	public void scrub(){
		append(" E11.scrub()");
		super.scrub();//Call base-class version
	}
	public void foam(){ append(" foam()");}
	public String toString(){ return cleanser.toString();}

	public static void main(String[] args) {
		E11 e11 = new E11();
		e11.dilute();
		e11.apply();
		e11.scrub();
		e11.foam();
		print(e11);

	}

}
