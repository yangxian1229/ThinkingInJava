package ch9;

class CharacterPairSwapper {
	static String swap(String s) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length() - 1; i += 2) {
			char c1 = sb.charAt(i);
			char c2 = sb.charAt(i + 1);
			sb.setCharAt(i, c2);
			sb.setCharAt(i + 1, c1);
		}
		return sb.toString();
	}
}

class SwapperAdapter implements Processor {
	@Override
	public String name() {
		return getClass().getSimpleName();
	}
	@Override
	public String process(Object input) {
		return CharacterPairSwapper.swap((String) input);
	}
}

public class E11 {
	public static void main(String[] args) {
		Apply.process(new SwapperAdapter(),"1234");
		Apply.process(new SwapperAdapter(),"abcde");
	}
}/* Output:
Using Processor SwapperAdapter
2143
Using Processor SwapperAdapter
badce
*///:~
