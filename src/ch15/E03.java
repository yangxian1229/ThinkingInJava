package ch15;

import net.mindview.util.FiveTuple;

class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E> {
	public final F sixth;
	public SixTuple(A a, B b, C c, D d, E e, F f) {
		super(a, b, c, d, e);
		sixth = f;
	}
	public String toString(){
		return "("+first+", "+second+", "+third+", "+fourth+", "+fifth+", "+sixth+")";
	}
}

public class E03 {
	public static void main(String[] args) {
		SixTuple<Integer,Character,Boolean,Float,Double,String> st = new SixTuple(1,'Q',true,0.123f,78.999999999,"Hello");
		System.out.println(st.toString());
	}
}
