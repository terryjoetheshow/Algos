package DataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> dict = new HashSet<String>(Arrays.asList("hot","dot","dog","lot","log"));
		System.out.println(LadderLength("hit", "cog", dict));
	}

	public static int LadderLength(String startWord, String endWord, Set<String> wordDict) {
		int count = 0;
		wordDict.add(endWord);
		char[] currWord = startWord.toCharArray();
		
		//Need to keep a queue of all the words currently considered at a particular breadth.  
		for (int i = 0; i < currWord.length; i++){ //change 1 letter at a time
			for (char c = 'a'; c < 'z'; c++) {
				char temp = currWord[i];
				if (currWord[i] != c)
					currWord[i] = c;
				
				String newWord = new String(currWord);
				if (wordDict.contains(newWord)) {
					count++;
					if (newWord == endWord)
						return count;
					else  {
						i = 0;
						wordDict.remove(newWord);
					}
				}
				else //restore currWord
					currWord[i] = temp;
			}
		}
		
		return 0;
	}
}
