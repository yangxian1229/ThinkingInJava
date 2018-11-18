package ch8;

public class E13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared shared = new Shared();
		Composing[] composing = {new Composing(shared),
				new Composing(shared),new Composing(shared),
				new Composing(shared),new Composing(shared)};
		
		for(Composing c:composing)
			c.dispose();
		
		System.gc();
		// Verify failure:
		new Composing(new Shared());
		System.gc();
	}

}
