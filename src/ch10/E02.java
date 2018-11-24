package ch10;

class E02A{
	private String s;
	E02A(String ss){
		s = ss;
	}
	public String toString(){
		return s;
	}
}

public class E02 {
	public static void main(String[] args) {
		Sequence sequence = new Sequence(5);
		sequence.add(new E02A("hahaha"));
		sequence.add(new E02A("hihihi"));
		sequence.add(new E02A("heiheihei"));
		sequence.add(new E02A("yoyoyo"));
		sequence.add(new E02A("xixixi"));
		
		Selector selector = sequence.selector();
		while(!selector.end()){
			System.out.println(selector.current()+" ");
			selector.next();
		}
	}
}/* Output:
hahaha 
hihihi 
heiheihei 
yoyoyo 
xixixi 
*///:~