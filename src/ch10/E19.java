package ch10;

public class E19 {
	class Inner1{
		class Inner2{
			void f(){}
		}
		Inner2 makeInner2(){return new Inner2();}
	}
	Inner1 makeInner1(){return new Inner1();}
	
	static class E19A{
		static class E19B{
			public void printB(){
				System.out.println("E19B Hello world!");
			}
		}
		public void printA(){
			System.out.println("E19A Hello world!");
		}
	}

	public static void main(String[] args) {
		new E19.E19A().printA();
		new E19.E19A.E19B().printB();
		E19 e = new E19();
		E19.Inner1 i1 = e.makeInner1();
		E19.Inner1.Inner2 i2 = i1.makeInner2();
	}
}/* Output:
E19A Hello world!
E19B Hello world!
*///:~
