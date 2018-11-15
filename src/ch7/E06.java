package ch7;

import static net.mindview.util.Print.print;

class Game{
	Game(int i){ print("Game constructor");}
}
class BoardGame extends Game{
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}
}


public class E06 extends BoardGame{
	E06(){
		super(11);
		print("E06 constructor");
	}
	public static void main(String[] args) {
		new E06();
	}

}
