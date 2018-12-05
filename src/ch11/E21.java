package ch11;

import java.util.*;
import net.mindview.util.TextFile;

public class E21 {
	public static void main(String[] args) {
		TextFile tf = new TextFile("src\\ch11\\UniqueWords.java","\\W+");
		Map<String,Integer> wordCount = new HashMap<String,Integer>();
		for(String word:tf){
			Integer freq = wordCount.get(word);
			wordCount.put(word,freq==null?1:freq+1);
		}
		System.out.println(wordCount);
		List<String> keys = new ArrayList<String>(wordCount.keySet());
		Collections.sort(keys,String.CASE_INSENSITIVE_ORDER);
		for(String key : keys)
			System.out.print(key+"="+wordCount.get(key)+", ");
	}
}
