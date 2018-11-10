package object;

public class E06_Storage {
	int storage(String s){
		return s.length()*2;
	}

	public static void main(String[] args) {
		E06_Storage s = new E06_Storage();
		System.out.println(s.storage("yangxian"));

	}

}
