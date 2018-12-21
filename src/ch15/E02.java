package ch15;

class Holder4<T>{
	private T a,b,c,d;
	public Holder4(T a, T b, T c, T d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public void setA(T a){
		this.a = a;
	}
	public T getA(){
		return a;
	}
	public String toString(){
		return a.toString()+" "+b.toString()+" "+c.toString()+" "+d.toString();
	}
}

public class E02 {
	public static void main(String[] args) {
		Holder4<String> holder = new Holder4<String>("A","B","C","D");
		System.out.println(holder.toString());
	}

}
