package ch16;

import java.util.Locale;
import java.util.Random;

public class E03 {
	private static double[][] f1(int row,int col,double low, double high) {
		double[][] a = new double[row][col];
		double increment = (high - low)/(row*col);
		double val = low;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				a[i][j] = val;
				val += increment;
			}
		}
		return a;
	}
	private static void printA(double[][] a){
		int row = a.length;
		int col = a[0].length;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.printf(Locale.US, "%.2f ", a[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printA(f1(5,4,10,99));
		
		
	}

}
