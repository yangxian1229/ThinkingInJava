package ch8;

import static net.mindview.util.Print.print;

class Member{
	public Member(String id){
		print("Member "+id);
	}
}

class Rodent1 {
	Member m1 = new Member("r1"),m2 = new Member("r2");
	public Rodent1(){
		print("Rodent1 construction");
	}
	public void hop() {
		print("Rodent1 hopping");
	}

	public void scurry() {
		print("Roden1t scurrying");
	}

	public void reproduce() {
		print("Making more Rodent1s");
	}

	public String toString() {
		return "Rodent1";
	}
}

class Mouse1 extends Rodent1 {
	Member m1 = new Member("m1"),m2 = new Member("m2");
	public Mouse1(){
		print("Mouse1 constructor");
	}
	public void hop() {
		print("Mouse1 hopping");
	}

	public void scurry() {
		print("Mouse1 scurrying");
	}

	public void reproduce() {
		print("Making more Mice1");
	}

	public String toString() {
		return "Mouse1";
	}
}

class Gerbil1 extends Rodent1 {
	Member m1 = new Member("g1"),m2 = new Member("g2");
	public Gerbil1(){
		print("Gerbil1 construct");
	}
	public void hop() {
		print("Gerbil1 hopping");
	}

	public void scurry() {
		print("Gerbil1 scurrying");
	}

	public void reproduce() {
		print("Making more Gerbil1s");
	}

	public String toString() {
		return "Gerbil1";
	}
}

class Hamster1 extends Rodent1 {
	Member m1 = new Member("h1"),m2 = new Member("h2");
	public Hamster1(){
		print("Hamster1 construction");
	}
	public void hop() {
		print("Hamster1 hopping");
	}

	public void scurry() {
		print("Hamster1 scurrying");
	}

	public void reproduce() {
		print("Making more Hamster1s");
	}

	public String toString() {
		return "Hamster1";
	}
}

public class E12 {
	public static void main(String[] args) {
		new Mouse1();
		print("**********");
		new Gerbil1();
		print("**********");
		new Hamster1();

		
	}

}
