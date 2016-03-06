package LeetCode;

import java.util.HashMap;
import java.util.Map.Entry;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('c',  123);
		map.put('b',  5556);
		map.put('a',  122353);
		map.put('e',  45555);
		map.put('g',  13334);
		map.put('f',  1111);
		
		for(Entry e: map.entrySet()) {
			System.out.println(e.toString());
		}
	}

	
	
}
