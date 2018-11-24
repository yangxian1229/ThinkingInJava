package ch10;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {
	}

	public void destroy() {
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
	}

	public void destroy() {
	}

	public void kill() {
	}

	public void drinkBlood() {
	}
}

class HorrorShow {
	static void u(Monster b) {
		b.menace();
	}

	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}

	static void w(Lethal l) {
		l.kill();
	}

	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
} /// :~

public class E14 {
	public DangerousMonster getDM(){
		return new DangerousMonster(){
			public void destroy(){
				System.out.println("E14 getDM destroy");
			}
			public void menace() {
				System.out.println("E14 getDM menace");
			}
		};
	}
	public Vampire getV(){
		return new Vampire(){

			@Override
			public void destroy() {
				System.out.println("E14 getV destroy");
				
			}

			@Override
			public void menace() {
				System.out.println("E14 getV menace");
				
			}

			@Override
			public void kill() {
				System.out.println("E14 getV kill");
				
			}

			@Override
			public void drinkBlood() {
				System.out.println("E14 getV drinkBlood");
				
			}
			
		};
	}
	public static void main(String[] args) {
		E14 e = new E14();
		DangerousMonster dm = e.getDM();
		dm.destroy();
		dm.menace();
		Vampire v = e.getV();
		v.destroy();
		v.menace();
		v.kill();
		v.drinkBlood();
		
		DangerousMonster dm1 = new DangerousMonster(){
			public void menace() {}
			public void destroy() {}
		};
		Vampire v1 = new Vampire(){
			public void menace() {}
			public void destroy() {}
			public void kill() {}
			public void drinkBlood() {}
		};
	}
}/* Output:
E14 getDM destroy
E14 getDM menace
E14 getV destroy
E14 getV menace
E14 getV kill
E14 getV drinkBlood
*///:~
