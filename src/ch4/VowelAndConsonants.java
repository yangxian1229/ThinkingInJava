/*
 * ������ӿ����������ĸ�����ж�������Ԫ�����Ǹ�����ĸ
 */
package ch4;

import static net.mindview.util.Print.*;

import java.util.Random;

public class VowelAndConsonants {
	public static void main(String[] args) {
		Random rand = new Random(47);
		for(int i=0;i<10;i++){
			int c = rand.nextInt(26)+'a';
			printnb((char)c+", "+c+": ");
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':print("vowel");
					 break;
			case 'y':
			case 'w':print("Sometimes a vowel");
					 break;
			default:print("consonant");
			}
		}
	}
}
