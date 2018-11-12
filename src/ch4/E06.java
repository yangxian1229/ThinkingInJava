package ch4;

public class E06 {
	static boolean test(int testval,int begin,int end){
		if(testval >= begin && testval <= end)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println(test(3, 1, 5));
		System.out.println(test(5, 1, 5));
		System.out.println(test(10, 1, 5));
	}

}
