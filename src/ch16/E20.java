package ch16;

import java.util.Arrays;

public class E20 {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		for(int i=0;i<3;i++)
			Arrays.fill(a[i],1);
		
		int[][] b = new int[3][3];
		for(int i=0;i<3;i++)
			Arrays.fill(b[i],1);
		
		System.out.println(Arrays.deepEquals(a,b));

	}

}
