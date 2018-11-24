package ch10;

class E15A{
	E15A(int i){
		System.out.println("E15A:"+i);
	}
	void print(){
		System.out.println("Hello world!");
	}
}

class E15B{
	public E15A f(int i){
		return new E15A(i){};
	}
	public E15A f2(int i){
		return new E15A(i){
			void print(){
				System.out.println("E15B f2()");
			}
		};
	}
}

public class E15 {
	public static void main(String[] args) {
		E15A ea = new E15B().f(3);
		ea.print();
		
		E15A ea2 = new E15B().f2(233);
		ea2.print();
	}
}/* Output:
E15A:3
Hello world!
E15A:233
E15B f2()
*///:~
