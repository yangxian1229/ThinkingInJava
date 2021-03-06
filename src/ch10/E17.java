package ch10;

interface Tossing{
	public boolean event();
}

interface TossingFactory{
	public Tossing getTossing();
}

class CoinTossing implements Tossing{
	private int events;
	private static final int EVENTS = 2;
	public boolean event(){
		System.out.println("Coin tossing event "+events);
		return ++events != EVENTS;
	}
	public static TossingFactory factory = new TossingFactory(){
		public CoinTossing getTossing(){
			return new CoinTossing();
		}
	};
}

class DiceTossing implements Tossing{
	private int events;
	private static final int EVENTS = 6;
	public boolean event(){
		System.out.println("Dice tossing event "+events);
		return ++events != EVENTS;
	}
	public static TossingFactory factory = new TossingFactory(){
		public DiceTossing getTossing(){
			return new DiceTossing();
		}
	};
}

public class E17 {
	public static void simulate(TossingFactory fact){
		Tossing t = fact.getTossing();
		while(t.event())
			;
	}
	public static void main(String[] args) {
		simulate(CoinTossing.factory);
		simulate(DiceTossing.factory);
	}
}/* Output:
Coin tossing event 0
Coin tossing event 1
Dice tossing event 0
Dice tossing event 1
Dice tossing event 2
Dice tossing event 3
Dice tossing event 4
Dice tossing event 5
*///:~
