package ch8;

import static net.mindview.util.Print.*;

class RectangularGlyph extends Glyph{
	private int a=1,b=2;
	RectangularGlyph(int a1,int b1){
		a = a1;
		b = b1;
		print("RectangularGlyph() a="+a+" b="+b);
	}
	void draw(){
		print("RectangularGlyph.draw() a="+a+" b="+b);
	}
}

public class E15 {
	public static void main(String[] args) {
		new RectangularGlyph(3,5);
	}
}/* Output:
Glyph() before draw()
RectangularGlyph.draw() a=0 b=0
Glyph() after draw()
RectangularGlyph() a=3 b=5
*///:~
