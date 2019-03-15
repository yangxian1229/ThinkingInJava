package ch16;

public class E02 {
	public static BerylliumSphere[] printBLS(int n){
		BerylliumSphere[] b = new BerylliumSphere[n];
		for(int i=0;i<n;i++)
			b[i] = new BerylliumSphere();
		return b;
	}

	public static void main(String[] args) {
		BerylliumSphere[] s = printBLS(4);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i].toString());
	

	}

}
