package com.solved_Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pascals_Triangle {

	public static void main(String[] args) {

		System.out.println(getRow(4));
	}

	public static List<Integer> getRow(int rowIndex) {

		List<Integer> now = new ArrayList<>();

		Map<Integer, int[]> now1 = new HashMap<>();

		for (int i = 0; i <= rowIndex; i++) {
			if (i == 0) {
				int[] test = new int[i + 1];
				test[i] = 1;
				now1.put(i, test);
			} else if (i == 1) {
				int[] test = new int[i + 1];
				test[0] = 1;
				test[1] = 1;
				now1.put(i, test);
			} else {
				int[] test = new int[i + 1];
				test[0] = 1;
				test[test.length - 1] = 1;
				for (int j = 1; j <= test.length - 2; j++) {
					int[] k = now1.get(i - 1);
					test[j] = (k[j - 1] + k[j]);
				}
				now1.put(i, test);
			}
		}

		int[] sam = now1.get(rowIndex);

		for (int i : sam) {
			now.add(i);
		}
		return now;
	}

}
