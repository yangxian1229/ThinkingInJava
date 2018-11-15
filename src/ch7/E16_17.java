package ch7;

import static net.mindview.util.Print.*;

class Amphibian{
	public void moveInWater(){print("Moving in Water");}
	public void moveOnLand(){print("Moving on Land");}
}

class Frog extends Amphibian{}

class Forg2 extends Amphibian{
	public void moveInWater(){print("Forg2 Moving in Water");}
	public void moveOnLand(){print("Forg2 Moving on Land");}
}

public class E16_17 {

	public static void main(String[] args) {
		Frog forg1 = new Frog();
		forg1.moveInWater();
		forg1.moveOnLand();
		
		Forg2 forg2 = new Forg2();
		forg2.moveInWater();
		forg2.moveOnLand();
	}
}/* Output:
Moving in Water
Moving on Land
Forg2 Moving in Water
Forg2 Moving on Land
*///:~
