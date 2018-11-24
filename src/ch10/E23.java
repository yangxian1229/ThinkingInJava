package ch10;

import static net.mindview.util.Print.*;

interface U{
	public void f1();
	public void f2();
	public void f3();
}

class A{
	public U getU(){
		return new U(){
			public void f1(){print("A f1()");}
			public void f2(){print("A f2()");}
			public void f3(){print("A f3()");}
		};
	}
}

class B{
	private U[] us;
	public B(int size){
		us = new U[size];
	}
	public boolean insertU(U u){
		for(int i =0;i<us.length;i++){
			if(us[i] == null){
				us[i] = u;
				return true;
			}
		}
		return false;
	}
	
	public boolean setNull(int i){
		if(i<0 || i>=us.length)
			return false;
		us[i] = null;
		return true;
	}
	
	public void visitUS(){
		for(int i=0;i<us.length;i++){
			if(us[i] != null){
				us[i].f1();
				us[i].f2();
				us[i].f3();
			}
		}
	}
}

public class E23 {
	public static void main(String[] args) {
		int N = 3;
		A as[] = new A[N];
		B b = new B(N);
		for(int i=0;i<N;i++){
			as[i] = new A();
			U u = as[i].getU();
			b.insertU(u);
		}
		b.visitUS();
		print("****************");
		b.setNull(1);
		b.setNull(2);
		b.visitUS();
	}

}
