package ch5;

import static net.mindview.util.Print.*;

enum PaperCurrencyTypes{
	ONE,TWO,FIVE,TEN,TWENTY,FIFTY
}

public class E21_E22 {
	static void describe(PaperCurrencyTypes pct){
		printnb(pct+" has a portrait of ");
		switch (pct) {
		case ONE:print("George Washington");
			     break;
		case TWO:print("Thomas Jefferson");
		         break;
		case FIVE: print("Abraham Lincoln");
					break;
		case TEN: print("Alexander Hamilton");
					break;
		case TWENTY: print("Andrew Jackson");
					break;
		case FIFTY: print("U.S. Grant");
					break;
		default: print("ERROR");
			break;
		}
	}
	public static void main(String[] args) {
		for(PaperCurrencyTypes s:PaperCurrencyTypes.values()){
			//21
			//print(s+", ordinal "+s.ordinal());
			describe(s);
		}
	}
}/* Output:
ONE has a portrait of George Washington
TWO has a portrait of Thomas Jefferson
FIVE has a portrait of Abraham Lincoln
TEN has a portrait of Alexander Hamilton
TWENTY has a portrait of Andrew Jackson
FIFTY has a portrait of U.S. Grant
*///:~
