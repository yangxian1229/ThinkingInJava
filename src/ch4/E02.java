package ch4;

import java.util.Random;

public class E02 {
	public static void main(String[] args) {
		int a[] = new int[25];
		int b[] = new int[24];
		Random rand = new Random();
		for(int i=0;i<25;i++){
			a[i] = rand.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<24;i++){
			if(a[i] > a[i+1]){
				b[i] = 1;
			}else if(a[i] < a[i+1]){
				b[i] = -1;
			}else if(a[i] == a[i+1]){
				b[i] = 1;
			}
			System.out.print(b[i]+"  ");
		}
		
	}

}
