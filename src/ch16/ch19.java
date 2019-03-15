package ch16;

import java.util.Arrays;

class A{
	int a;
	A(int a){
		this.a = a;
	}
	public boolean equals(Object o){
		return a == ((A) o).a;
	}
}

public class ch19 {
	public static void main(String[] args) {
		A[] a1 = {new A(1), new A(2), new A(3)};
		A[] a2 = {new A(1), new A(2), new A(3)};
		
		System.out.println(Arrays.equals(a1,a2));
		
	}

}
