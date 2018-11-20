package ch9;

import ch9_1.E05A;

public class E05 implements E05A{
	public void hello(){
		System.out.println("Hello");
	}
	public void hi(String s){
		System.out.println(s+" say hi");
	}
	public void age(int i){
		System.out.println("age: "+i);
	}

	public static void main(String[] args) {
		E05 e = new E05();
		e.hello();
		e.hi("haha");
		e.age(22);
	}
}
