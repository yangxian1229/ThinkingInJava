package ch11;

import java.util.*;
import net.mindview.util.*;

class WordCounter{
	public static final Comparator<WordCounter> CASE_INSENSITIVE_ORDER = 
			new Comparator<WordCounter>() {
		public int compare(WordCounter o1, WordCounter o2){
			return o1.word.compareToIgnoreCase(o2.word);
		}
	};
	private final String word;
	private int frequency;
	WordCounter(String word) {
		this.word = word;
		frequency = 1;
	}
	void incFrequency(){++frequency;}
	String getWord(){return word;}
	int getFrequency(){return frequency;}
	public boolean equals(Object o){
		return o instanceof WordCounter && word.equals(((WordCounter)o).word);
	}
	public int hashCode() {return word.hashCode(); }
}

public class E22 {
	static void updateStat(Iterator<WordCounter> it, WordCounter wc) {
		while(it.hasNext()) {
			WordCounter currentWC = it.next();
			if(currentWC.equals(wc))
				currentWC.incFrequency();
		}
	}
	public static void main(String[] args) {
		Set<WordCounter> stat = new HashSet<WordCounter>();
		for(String word : new TextFile("src\\ch11\\UniqueWords.java","\\W+")) {
			WordCounter wc = new WordCounter(word);
			if(stat.contains(wc))
				updateStat(stat.iterator(),wc);
			else
				stat.add(wc);
		}
		List<WordCounter> l = new ArrayList<WordCounter>(stat);
		Collections.sort(l,WordCounter.CASE_INSENSITIVE_ORDER);
		for(WordCounter wc : l)
			System.out.println(wc.getWord() + " => "+wc.getFrequency());
	}

}
