package ch4;
import static net.mindview.util.Print.*;

public class E05 {
	static void toBinaryString(int a){
		char buffer[] = new char[32];
		int position = 32;
		do{
			buffer[--position] = 
					((a & 0x01) != 0) ? '1' :'0';
			a >>>= 1;
		}while(a!=0);
		for(int i=position;i<32;i++)
			printnb(buffer[i]);
		print();
	}
	public static void main(String[] args) {
		int i1 = 0xaaaaaaaa;
		int i2 = 0x55555555;
		
		printnb("i1 = "); toBinaryString(i1);
		printnb("i2 = "); toBinaryString(i2);
		printnb("~i1 = "); toBinaryString(~i1);
		printnb("~i2 = "); toBinaryString(~i2);
		printnb("i1 & i1 = "); toBinaryString(i1 & i1);
		printnb("i1 | i1 = "); toBinaryString(i1 | i1);
		printnb("i1 ^ i1 = "); toBinaryString(i1 ^ i1);
		printnb("i1 & i2 = "); toBinaryString(i1 & i2);
		printnb("i1 | i2 = "); toBinaryString(i1 | i2);
		printnb("i1 ^ i2 = "); toBinaryString(i1 ^ i2);
	}
}
