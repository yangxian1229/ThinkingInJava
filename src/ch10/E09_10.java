package ch10;

interface SimpleInterface{
	public void print();
}

public class E09_10 {
	SimpleInterface simpleF(){
		class simpleC implements SimpleInterface{
			public void print(){
				System.out.println("E09_10 simpleF simpleC");
			}
		}
		return new simpleC();
	}
	public static void main(String[] args) {
		E09_10 e = new E09_10();
		e.simpleF().print();
	}
}/* Output:
E09_10 simpleF simpleC
*///:~
