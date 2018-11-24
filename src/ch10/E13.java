package ch10;

public class E13 {
	SimpleInterface simpleF(){
		return new SimpleInterface(){
			public void print(){
				System.out.println("E13 simpleF simpleC");
			}
		};
	}
	public static void main(String[] args) {
		SimpleInterface si = new E13().simpleF();
		si.print();
	}
}/* Output:
E13 simpleF simpleC
*///:~
