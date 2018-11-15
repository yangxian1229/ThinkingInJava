package ch7_1;


public class Villain {
	private String name;
	protected void set(String nm){ name=nm;}
	public Villain(String name){ this.name = name;}
	public String toString(){
		return "I'm a villain, my name is "+name;
	}

}
