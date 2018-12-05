package ch11;

import java.util.*;
import net.mindview.util.*;

public class E16 {
	public static void main(String[] args) {
		Set<Character> vowels  = new HashSet<Character>(
				Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		HashSet<String> processedWords = new HashSet<String>();
		int fileVowel = 0;
		int wordVowel = 0;
		TextFile tf = new TextFile("src\\ch11\\UniqueWords.java","\\W+");
		for(String word:tf){
			wordVowel=0;
			
			for(char c:word.toCharArray())
				if(vowels.contains(c))
					wordVowel++;
			if(!processedWords.contains(word)){
				processedWords.add(word);
				System.out.println(word+" has "+wordVowel);
			}
			fileVowel += wordVowel;
		}
		System.out.println("Total number of vowels in file: " + fileVowel);
	}
}
