package com.solved_puzzles;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString_WithoutRepeatingCharacters {

	static List<Character> s1 = new ArrayList<>();

	public static int lengthOfLongestSubstring(String s) {

		char[] ch = s.toCharArray();
		List<Character> l1 = new ArrayList<>();
		int count = 0, count1 = 0;

		for (int i = 0; i <= ch.length - 1; i++) {
			if (!l1.contains(ch[i])) {
				l1.add(ch[i]);
				count += 1;
			} else if (l1.contains(ch[i]) && l1.size() >= count1) {
				count = l1.size();
				count1 = l1.size();
				for (int i1 = 0; i1 <= l1.size() - 1; i1++) {
					if (l1.get(i1).equals(ch[i])) {
						if (i1 == l1.size() - 1) {
							l1.removeAll(l1);
						} else {
							l1.remove(i1);
						}
					}
				}
				count = count - 1;
				i = i - 1;
			} else {
				l1.removeAll(l1);
				i = i - 1;
			}

		}
		if (count > count1)
			return count;
		else
			return count1;
	}

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		// working for following inputs: bbbb, pwwkew, "", " ", "au", "dvdf"
	}

}
