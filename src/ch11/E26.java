package ch11;

import java.util.*;
import java.util.Map.Entry;

import net.mindview.util.TextFile;

public class E26 {
	public static void main(String args[]){
		Map<String,ArrayList<Integer>> m = new HashMap<String,ArrayList<Integer>>();
		int wordCount = 0;
		TextFile tf = new TextFile("src\\ch11\\E26.java","\\W+");
		for(String word : tf){
			ArrayList<Integer> l = m.get(word);
			if(l==null){
				l = new ArrayList<Integer>();
				m.put(word,l);
			}
			l.add(++wordCount);	
		}
		System.out.println(m);
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		for(Entry<String,ArrayList<Integer>> e : m.entrySet())
			for(int p : e.getValue())
				tm.put(p,e.getKey());
		
		System.out.println(tm);		
	}
}
