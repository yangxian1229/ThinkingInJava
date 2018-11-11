package ch3;

public class ch11 {
	static void charToBinary(char c){
		System.out.println(Integer.toBinaryString((int)c));
	}
	public static void main(String[] args) {
		//11
		int a = 0x80;
		
		while(a != 0){
			System.out.println(Integer.toBinaryString(a));
			a >>= 1;
		}
		
		//12
		int b = 0xff;
		System.out.println(Integer.toBinaryString(b));
		b <<= 1;
		while(b != 0){
			System.out.println(Integer.toBinaryString(b));
			b >>>=1;
		}
		
		//13
		charToBinary('a');
		charToBinary('b');
		charToBinary('c');

	}

}
