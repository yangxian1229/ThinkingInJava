package ch5;

class Dog{
	void bark(int i){
		System.out.println("barking");
	}
	void bark(String name){
		System.out.println(name+" says howling");
	}
	void bark(int i,String name){
		System.out.println(i+name);
	}
	void bark(String name,int i){
		System.out.println(name+i);
	}
}
public class E05_E06_E07 {
	public static void main(String[] args) {
		Dog haha = new Dog();
		haha.bark(1);
		haha.bark("haha");
		haha.bark(1,"haha");
		haha.bark("haha",1);
	}

}
