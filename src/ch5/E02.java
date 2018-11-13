package ch5;

class StringTest1{
	String s="aaaa";
	String s2;
	StringTest1(String s1){
		s2 = s1;
	}
}

public class E02 {
	public static void main(String[] args) {
		StringTest1  st = new StringTest1("bbbb");
		System.out.println(st.s);
		System.out.println(st.s2);
		
	}
}
