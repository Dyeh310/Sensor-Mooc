package e24.multiple.entry.dictionary;

import java.util.Set;

public interface MultipleEntryDictionary {

	
	//adds a new entry to a word, maintaing the old ones
	public void add(String word, String translation);
	
	
	//this returns the set object with all entries, or a nmull reference if the word is not in the dictionary
	public Set<String> translate(String word);
	
	
	//Removes a word and all entries from the dicitonary
	public void remove (String word);
	
	
}
