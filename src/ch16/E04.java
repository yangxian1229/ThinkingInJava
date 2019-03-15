package ch16;

import java.util.Locale;

public class E04 {
	private static double[][][] f1(
			int row,int col,int high,double l, double h){
		double[][][] s = new double[row][col][high];
		double increment = (h-l)/(row*col*high);
		double val = l;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				for(int k=0;k<high;k++){
					s[i][j][k] = val;
					val += increment;
				}
			}
		}
		
		return s;
	}
	
	static void printS(double[][][] s){
		for(int i=0;i<s.length;i++){
			System.out.print("{");
			for(int j=0;j<s[i].length;j++){
				System.out.print("{");
				for(int k=0;k<s[i][j].length;k++){
					System.out.printf(Locale.US, "%.2f ", s[i][j][k]);
				}
				System.out.print("}" + " ");
			}
			System.out.print("}\n");
		}
	}

	public static void main(String[] args) {
		printS(f1(2,3,4,55,99));

	}

}
