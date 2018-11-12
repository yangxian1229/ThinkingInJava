package ch4;

public class E07 {
	static void printNum(){
		for(int i=1;i<=100;i++){
			System.out.print(i+" ");
			if(i==99)
				return;
		}
	}

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			System.out.print(i+" ");
			if(i==99)
				break;
		}
		System.out.println();
		printNum();

	}

}
