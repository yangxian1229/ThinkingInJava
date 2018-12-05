package ch11;

import java.util.*;

import net.mindview.util.TextFile;

public class E25 {
	public static void main(String args[]){
		Map<String,ArrayList<Integer>> m = new HashMap<String,ArrayList<Integer>>();
		int wordCount = 0;
		TextFile tf = new TextFile("src\\ch11\\UniqueWords.java","\\W+");
		for(String word : tf){
			ArrayList<Integer> l = m.get(word);
			if(l==null){
				l = new ArrayList<Integer>();
				m.put(word,l);
			}
			l.add(++wordCount);	
		}
		System.out.println(m);
	}

}
